package AVA.Linhas.Aereas.DTOEntrada;

import AVA.Linhas.Aereas.Enum.TipoClasse;

import java.time.LocalDate;

public record DadosBuscarVoo (String origem,
                              String destino,
                              LocalDate dataIda,
                              LocalDate dataVolta,
                              TipoClasse classe){
}
