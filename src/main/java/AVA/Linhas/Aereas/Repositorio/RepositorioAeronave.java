package AVA.Linhas.Aereas.Repositorio;

import AVA.Linhas.Aereas.Entidades.Aeronave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositorioAeronave extends JpaRepository<Aeronave, Long> {
    Optional<Aeronave> findById(Long id);


}
