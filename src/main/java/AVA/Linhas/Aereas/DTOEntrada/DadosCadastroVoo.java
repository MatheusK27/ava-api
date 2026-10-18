package AVA.Linhas.Aereas.DTOEntrada;

import AVA.Linhas.Aereas.Entidades.Aeronave;
import AVA.Linhas.Aereas.Enum.ModeloAeronave;
import AVA.Linhas.Aereas.Enum.TipoClasse;

import java.time.LocalDate;

public record DadosCadastroVoo(String origem, String destino, LocalDate dataIda, LocalDate dataVolta,
                               Aeronave aeronave, TipoClasse classe){
}
