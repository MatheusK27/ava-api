package AVA.Linhas.Aereas.Repositorio;

import AVA.Linhas.Aereas.Entidades.Reserva;
import AVA.Linhas.Aereas.Entidades.Voo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RepositorioReserva extends JpaRepository<Reserva, Long> {


}
