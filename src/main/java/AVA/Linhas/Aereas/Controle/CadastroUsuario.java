package AVA.Linhas.Aereas.Controle;


import AVA.Linhas.Aereas.DTOEntrada.DadosEntradaUsuario;
import AVA.Linhas.Aereas.DTOSaida.DadosSaidaUsuario;
import AVA.Linhas.Aereas.Servico.ServicoUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class CadastroUsuario {

       private final ServicoUsuario servicoUsuario;

       @PostMapping
       public ResponseEntity<DadosSaidaUsuario> CadastroUsuario(@RequestBody DadosEntradaUsuario dados){
          var usuario= servicoUsuario.cadastrarUsuario(dados);
           return ResponseEntity.ok().body(usuario);
       }
}
