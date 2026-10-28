package AVA.Linhas.Aereas.Repositorio;

import AVA.Linhas.Aereas.Entidades.Reserva;

import org.springframework.data.jpa.repository.JpaRepository;



public interface RepositorioReserva extends JpaRepository<Reserva, Long> {

    boolean existsByVoo_Id(Long vooId);
}
