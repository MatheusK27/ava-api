package AVA.Linhas.Aereas.Entidades;


import AVA.Linhas.Aereas.DTOEntrada.DadosCadastroAeronave;
import AVA.Linhas.Aereas.Enum.ModeloAeronave;
import AVA.Linhas.Aereas.Enum.TipoClasse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="aeronaves")
public class Aeronave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private ModeloAeronave aeronave;

    @ElementCollection
    @CollectionTable(
            name = "aeronave_classes",
            joinColumns = @JoinColumn(name = "aeronave_id")
    )
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name = "classe", nullable = false)
    @Column(name = "quantidade_assentos", nullable = false)
    private Map<TipoClasse,Integer> assentosPorClasse = new EnumMap<>(TipoClasse.class);


    public Aeronave(DadosCadastroAeronave dados) {
        this.aeronave = dados.modeloAeronave();
        this.assentosPorClasse.putAll(dados.assentosPorClasse());


    }

    public int totalAssentos(){
        return assentosPorClasse.values().stream().mapToInt(Integer::intValue).sum();

    }


}
