package AVA.Linhas.Aereas.Repositorio;


import AVA.Linhas.Aereas.Entidades.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RepositorioUsuario extends JpaRepository<CadastroUsuario,Long> {

}
