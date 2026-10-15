package AVA.Linhas.Aereas.DTOEntrada;

import AVA.Linhas.Aereas.Entidades.Endereco;

import java.time.LocalDate;

public record DadosEntradaUsuario(String primeiroNome,
                                  String ultimoNome,
                                  String cpf,
                                  LocalDate dataNascimento,
                                  String telefone,
                                  Endereco  endereco,
                                  String numeroPassaporte,
                                  String email,
                                  String senha
                                ) {
}
