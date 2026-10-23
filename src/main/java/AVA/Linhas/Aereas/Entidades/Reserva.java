package AVA.Linhas.Aereas.Entidades;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;

import java.util.ArrayList;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "reservas")
public class Reserva{

    private static final SecureRandom RANDOM = new SecureRandom();

    private static final String CARACTERES =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "codigo_reserva",
            nullable = false,
            unique = true,
            length = 6,
            updatable = false
    )
    private String codigoReserva;


    @ManyToMany
    @JoinTable(
            name = "reserva_usuarios",
            joinColumns = @JoinColumn(name = "reserva_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private List<Usuario> usuario = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "reserva_voos",
            joinColumns = @JoinColumn(name = "reserva_id"),
            inverseJoinColumns = @JoinColumn(name = "voo_id")
    )
    private  List<Voo> voo;


    public Reserva(List<Usuario> usuario, List<Voo> voo) {
        this.usuario = new ArrayList<>(usuario);
        this.voo =  new ArrayList<>(voo);
        gerarCodigoReserva();

    }



    @PrePersist
    private void gerarCodigoReserva() {
        if (codigoReserva == null) {
            StringBuilder codigo = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                int posicao = RANDOM.nextInt(CARACTERES.length());
                codigo.append(CARACTERES.charAt(posicao));
            }

            this.codigoReserva = codigo.toString();
        }
    }

}