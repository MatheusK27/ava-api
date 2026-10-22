package AVA.Linhas.Aereas.Entidades;


import AVA.Linhas.Aereas.DTOEntrada.DadosEntradaUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String primeiroNome;

    @Column(nullable = false)
    private String ultimoNome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String telefone;

    @Embedded
    private Endereco endereco;

    @Column( unique = true)
    private String numeroPassaporte;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
        private String senha;

    private boolean ativo = true;


    public Usuario(DadosEntradaUsuario dados) {
        this.primeiroNome = dados.primeiroNome();
        this.ultimoNome = dados.ultimoNome();
        this.cpf = dados.cpf();
        this.dataNascimento = dados.dataNascimento();
        this.telefone = dados.telefone();
        this.endereco = dados.endereco();
        this.numeroPassaporte = dados.numeroPassaporte();
        this.email = dados.email();
        this.senha = dados.senha();


    }

}
