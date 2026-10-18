package AVA.Linhas.Aereas.DTOSaida;
import AVA.Linhas.Aereas.Entidades.Voo;
import AVA.Linhas.Aereas.Enum.ModeloAeronave;
import AVA.Linhas.Aereas.Enum.TipoClasse;

import java.time.LocalDate;

public record DadosVoo (  Long id,
                          String origem,
                          String destino,
                          LocalDate dataIda,
                          LocalDate dataVolta,
                          ModeloAeronave aeronave,
                          TipoClasse classe) {

    public DadosVoo(Voo dados) {
        this(dados.getId(), dados.getOrigem(), dados.getDestino(), dados.getDataIda(),dados.getDataVolta(),
                dados.getAeronave().getAeronave(),dados.getClasse());
    }
}
