package AVA.Linhas.Aereas.DTOSaida;

import AVA.Linhas.Aereas.Entidades.Aeronave;
import AVA.Linhas.Aereas.Entidades.Reserva;
import AVA.Linhas.Aereas.Entidades.Usuario;
import AVA.Linhas.Aereas.Entidades.Voo;

import java.util.List;

public record SaidaReserva(
        String codigoReserva,
        List<String> usuariosIds,
        List<Long> voos,
        List<String> origens,
        List<Aeronave> aeronave




) {

    public SaidaReserva(Reserva reserva) {
        this(reserva.getCodigoReserva(),
                reserva.getUsuario()
                        .stream()
                        .map(Usuario::getPrimeiroNome)
                        .toList(),
                reserva.getVoo().stream().map(Voo::getId).toList(),
                reserva.getVoo().stream().map(Voo::getOrigem).toList(),
                reserva.getVoo().stream().map(Voo::getAeronave).toList());


    }
}