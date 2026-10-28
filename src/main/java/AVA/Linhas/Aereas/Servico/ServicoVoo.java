package AVA.Linhas.Aereas.Servico;


import AVA.Linhas.Aereas.DTOEntrada.DadosCadastroVoo;
import AVA.Linhas.Aereas.DTOSaida.DadosVoo;
import AVA.Linhas.Aereas.Entidades.Aeronave;
import AVA.Linhas.Aereas.Entidades.Voo;
import AVA.Linhas.Aereas.Repositorio.RepositorioAeronave;
import AVA.Linhas.Aereas.Repositorio.RepositorioReserva;
import AVA.Linhas.Aereas.Repositorio.RepositorioVoo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoVoo {

    private final RepositorioVoo repositorioVoo;
    private final RepositorioAeronave repositorioAeronave;
    private final RepositorioReserva repositorioReserva;



    public DadosVoo cadastarVoo(DadosCadastroVoo dados){
        Aeronave aeronave= repositorioAeronave.findById(dados.aeronave().getId()).orElse(null);
        Voo voo = new Voo(dados);
        voo.setAeronave(aeronave);
        return new DadosVoo( repositorioVoo.save(voo));

    }


    @Transactional
    public void desativarVoo(Long id){
        Voo voo= repositorioVoo.findById(id).orElseThrow(() -> new RuntimeException("Id inválido"));
        if(repositorioReserva.existsByVoo_Id(id)){
            throw new RuntimeException("Existe uma reserva vinculada a esse voo");
        }
        voo.desativarVoo();
    }
}
