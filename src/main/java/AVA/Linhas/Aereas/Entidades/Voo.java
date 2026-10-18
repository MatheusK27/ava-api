package AVA.Linhas.Aereas.Entidades;


import AVA.Linhas.Aereas.DTOEntrada.DadosCadastroVoo;
import AVA.Linhas.Aereas.Enum.ModeloAeronave;
import AVA.Linhas.Aereas.Enum.TipoClasse;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name="voo")
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String origem;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private LocalDate dataIda;

    @Column(nullable = false)
    private LocalDate dataVolta;

    @ManyToOne(fetch = FetchType.LAZY)
    private Aeronave aeronave;

    @Enumerated(EnumType.STRING)
    private TipoClasse classe;

    public Voo(DadosCadastroVoo dados) {
        this.origem = dados.origem();
        this.destino = dados.destino();
        this.dataIda = dados.dataIda();
        this.dataVolta = dados.dataVolta();
        this.aeronave = dados.aeronave();
        this.classe = dados.classe();

    }
}

