package AVA.Linhas.Aereas.Controle;


import AVA.Linhas.Aereas.DTOEntrada.DadosCadastroVoo;
import AVA.Linhas.Aereas.DTOSaida.DadosVoo;
import AVA.Linhas.Aereas.Servico.ServicoVoo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voo")
@RequiredArgsConstructor
public class CadastrarVoo {

    private final ServicoVoo servicoVoo;


    @PostMapping
    public ResponseEntity<DadosVoo> cadastrarVoo(@RequestBody  DadosCadastroVoo dados){
        var cadastro = servicoVoo.cadastarVoo(dados);
        return ResponseEntity.ok().body(cadastro);
    }

}
