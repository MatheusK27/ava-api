package AVA.Linhas.Aereas.Controle;


import AVA.Linhas.Aereas.DTOEntrada.DadosReverva;
import AVA.Linhas.Aereas.DTOSaida.SaidaReserva;
import AVA.Linhas.Aereas.Entidades.Reserva;
import AVA.Linhas.Aereas.Servico.ServicoReserva;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reserva")
public class ControleReserva {

    private final ServicoReserva servicoReserva;



    @PostMapping
    public ResponseEntity<SaidaReserva> fazerReserva(@RequestBody DadosReverva dados){
        var reserva =  servicoReserva.fazerReserva(dados);

        return ResponseEntity.ok().body(reserva);
    }

}
