package AVA.Linhas.Aereas.DTOEntrada;

import AVA.Linhas.Aereas.Entidades.Usuario;

import java.time.LocalDate;
import java.util.List;

public record DadosReverva(
        List<Usuario> usuario,
        String origem,
        String destino,
        LocalDate dataIda,
        LocalDate dataVolta
) {}