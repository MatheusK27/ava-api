package AVA.Linhas.Aereas.DTOEntrada;

import AVA.Linhas.Aereas.Entidades.Usuario;
import AVA.Linhas.Aereas.Entidades.Voo;

import java.util.List;

public record DadosReverva(
        List<Usuario> usuario,
        List<Voo> voo
) {}