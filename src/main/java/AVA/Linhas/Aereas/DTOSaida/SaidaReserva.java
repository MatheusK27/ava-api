package AVA.Linhas.Aereas.DTOSaida;

import AVA.Linhas.Aereas.Entidades.Reserva;
import AVA.Linhas.Aereas.Entidades.Usuario;
import AVA.Linhas.Aereas.Entidades.Voo;

import java.util.List;

public record SaidaReserva(
        String codigoReserva,
        List<Long> usuariosIds,
        List<Long> voosIds
) {

    public SaidaReserva(Reserva reserva) {
        this(
                reserva.getCodigoReserva(),
                reserva.getUsuario()
                        .stream()
                        .map(Usuario::getId)
                        .toList(),
                reserva.getVoos()
                        .stream()
                        .map(Voo::getId)
                        .toList()
        );
    }
}