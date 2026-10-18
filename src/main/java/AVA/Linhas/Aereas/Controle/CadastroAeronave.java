package AVA.Linhas.Aereas.Controle;


import AVA.Linhas.Aereas.DTOEntrada.DadosCadastroAeronave;
import AVA.Linhas.Aereas.DTOEntrada.DadosEntradaUsuario;
import AVA.Linhas.Aereas.DTOSaida.DadosAeronave;
import AVA.Linhas.Aereas.Servico.ServicoAeronave;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aeronave")
@RequiredArgsConstructor
public class CadastroAeronave {

   private final ServicoAeronave servicoAeronave;

   @PostMapping
    public ResponseEntity <DadosAeronave> cadastrarAeronave(@RequestBody DadosCadastroAeronave dados){
        var cadastro = servicoAeronave.cadastrarAeronave(dados);
        return ResponseEntity.ok().body(cadastro);

    }

}
