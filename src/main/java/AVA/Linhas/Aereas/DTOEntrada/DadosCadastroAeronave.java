package AVA.Linhas.Aereas.DTOEntrada;

import AVA.Linhas.Aereas.Enum.ModeloAeronave;
import AVA.Linhas.Aereas.Enum.TipoClasse;

import java.util.Map;
import java.util.Set;

public record DadosCadastroAeronave(ModeloAeronave modeloAeronave,
                                   Map<TipoClasse, Integer> assentosPorClasse
                                    ) {
}
