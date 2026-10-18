package AVA.Linhas.Aereas.DTOSaida;

import AVA.Linhas.Aereas.Entidades.Voo;
import AVA.Linhas.Aereas.Enum.TipoClasse;

import java.time.LocalDate;
import java.util.Optional;

public record DadosBusca(String origem,
                         String destino,
                         LocalDate dataIda,
                         LocalDate dataVolta,
                         TipoClasse classe) {
    public DadosBusca(Voo dados) {
        this(dados.getOrigem(),dados.getDestino(),dados.getDataIda(),dados.getDataVolta(),dados.getClasse());
    }

}
