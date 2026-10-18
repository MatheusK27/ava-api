package AVA.Linhas.Aereas.Servico;



import AVA.Linhas.Aereas.DTOEntrada.DadosCadastroAeronave;
import AVA.Linhas.Aereas.DTOSaida.DadosAeronave;
import AVA.Linhas.Aereas.Entidades.Aeronave;
import AVA.Linhas.Aereas.Repositorio.RepositorioAeronave;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoAeronave {


    private final RepositorioAeronave repositorioAeronave;

    public DadosAeronave cadastrarAeronave (DadosCadastroAeronave dados){
        var cadastro= new Aeronave(dados);
        return new DadosAeronave(repositorioAeronave.save(cadastro));
    }
}
