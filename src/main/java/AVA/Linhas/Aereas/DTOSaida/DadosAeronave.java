package AVA.Linhas.Aereas.DTOSaida;

import AVA.Linhas.Aereas.Entidades.Aeronave;
import AVA.Linhas.Aereas.Enum.ModeloAeronave;
import AVA.Linhas.Aereas.Enum.TipoClasse;

import java.util.Map;


public record DadosAeronave(Long id,
                            ModeloAeronave aeronave,
                            Integer totalAssentos ) {



    public DadosAeronave(Aeronave dados) {
        this(dados.getId(), dados.getAeronave(),dados.totalAssentos());
    }
}
