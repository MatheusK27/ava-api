package AVA.Linhas.Aereas.DTOSaida;

import AVA.Linhas.Aereas.Entidades.Aeronave;
import AVA.Linhas.Aereas.Entidades.Reserva;
import AVA.Linhas.Aereas.Entidades.Usuario;
import AVA.Linhas.Aereas.Entidades.Voo;

import java.time.LocalDate;
import java.util.List;

public record SaidaReserva(
        Long idReserva,
        String codigoReserva,
        List<String> usuariosIds,
        List<Long> voos,
        List<String> origem,
        List<LocalDate> dataIda,
        List<String> destino,
        List<LocalDate> dataVolta

) {

    public SaidaReserva(Reserva reserva) {
        this(reserva.getId(),
                reserva.getCodigoReserva(),
                reserva.getUsuario()
                        .stream()
                        .map(Usuario::getPrimeiroNome)
                        .toList(),
                reserva.getVoo().stream().map(Voo::getId).toList(),
                reserva.getVoo().stream().map(Voo::getOrigem).toList(),
                reserva.getVoo().stream().map(Voo::getDataIda).toList(),
                reserva.getVoo().stream().map(Voo::getDestino).toList(),
                reserva.getVoo().stream().map(Voo::getDataVolta).toList());





    }
}