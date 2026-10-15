package AVA.Linhas.Aereas.Servico;


import AVA.Linhas.Aereas.DTOEntrada.DadosEntradaUsuario;
import AVA.Linhas.Aereas.DTOSaida.DadosSaidaUsuario;
import AVA.Linhas.Aereas.Entidades.CadastroUsuario;
import AVA.Linhas.Aereas.Repositorio.RepositorioUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoUsuario {

    private final RepositorioUsuario repositorioUsuario;

    public DadosSaidaUsuario cadastrarUsuario(DadosEntradaUsuario dados) {
        var usuario = new CadastroUsuario(dados);
        repositorioUsuario.save(usuario);
        return new DadosSaidaUsuario(usuario);
    }
}
