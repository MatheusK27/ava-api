package AVA.Linhas.Aereas.Controle;


import AVA.Linhas.Aereas.DTOEntrada.DadosBuscarVoo;
import AVA.Linhas.Aereas.DTOSaida.DadosBusca;
import AVA.Linhas.Aereas.Servico.ServicoBuscarVoo;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/busca")
@RequiredArgsConstructor
public class ControleBusca {

    private final ServicoBuscarVoo servicoBuscarVoo;

    @GetMapping
    public ResponseEntity<List<DadosBusca>> buscarVoosPorOrigemEDestino(@RequestBody DadosBuscarVoo dados){
        var busca =servicoBuscarVoo.buscarVoosPorOrigemEDestino(dados);
        return ResponseEntity.ok(busca);
    }
}
