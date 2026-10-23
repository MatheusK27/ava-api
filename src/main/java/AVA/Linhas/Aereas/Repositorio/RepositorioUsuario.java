package AVA.Linhas.Aereas.Repositorio;


import AVA.Linhas.Aereas.Entidades.Usuario;
import AVA.Linhas.Aereas.Entidades.Voo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepositorioUsuario extends JpaRepository<Usuario,Long> {
    Optional<Usuario> findById(Long id );



}
