package AVA.Linhas.Aereas.DTOSaida;

import AVA.Linhas.Aereas.Entidades.Usuario;

public record DadosSaidaUsuario( Long id , String primeiroNome, String email, String cpf) {
    public DadosSaidaUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getPrimeiroNome(), usuario.getEmail(), usuario.getCpf());
    }
}
