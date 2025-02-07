

package Repository;

import Model.Pacientes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Pacientes,Long> {
    
}
