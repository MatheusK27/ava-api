package AVA.Linhas.Aereas.Servico;


import AVA.Linhas.Aereas.DTOEntrada.DadosReverva;
import AVA.Linhas.Aereas.DTOSaida.SaidaReserva;
import AVA.Linhas.Aereas.Entidades.Reserva;
import AVA.Linhas.Aereas.Entidades.Usuario;
import AVA.Linhas.Aereas.Entidades.Voo;
import AVA.Linhas.Aereas.Repositorio.RepositorioReserva;
import AVA.Linhas.Aereas.Repositorio.RepositorioUsuario;
import AVA.Linhas.Aereas.Repositorio.RepositorioVoo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoReserva {


    private final RepositorioUsuario repositorioUsuario;
    private final RepositorioVoo repositorioVoo;
    private final RepositorioReserva repositorioReserva;


    public SaidaReserva fazerReserva(DadosReverva dados) {
        var usuario= repositorioUsuario.findAllById(dados.usuario());
        var voo= repositorioVoo.findAllById(dados.voo());
        var reserva = new Reserva(usuario,voo);
        var novaReserva= repositorioReserva.save(reserva);
        return new SaidaReserva(novaReserva);
    }
}
