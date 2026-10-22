package AVA.Linhas.Aereas.Repositorio;

import AVA.Linhas.Aereas.Entidades.Voo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RepositorioVoo extends JpaRepository<Voo,Long> {

    List<Voo> findByOrigemAndDestino(String origem, String destino);

    List<Voo> findByOrigemAndDestinoAndDataIdaAndDataVolta(
            String origem,
            String destino,
            LocalDate dataIda,
            LocalDate dataVolta
    );
}
