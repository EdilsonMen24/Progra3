package Service;

import Model.Pacientes;
import Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;
    public List<Pacientes> buscarTodos(){
        return (List<Pacientes>) pacienteRepository.findAll();
    }

    public Pacientes buscarPorId(Long id){
        Pacientes buscado = pacienteRepository.findById(id).orElseThrow( ()
         -> new RuntimeException("No se encontro el paciente con id:" + id));

        return buscado;
    }

    public Pacientes actualizarPaciente(Pacientes paciente, Long id){
        Pacientes buscado = pacienteRepository.findById(id).orElseThrow( ()
                -> new RuntimeException("No se encontro el paciente con id:" + id));

        if(buscado != null){
            buscado.setNombre(paciente.getNombre());
            buscado.setEdad(paciente.getEdad());
            buscado.setDiagnostico((paciente.getDiagnostico()));
            pacienteRepository.save(buscado);
        }
        return buscado;
    }

    public String eliminarPaciente(Long id){
        Pacientes buscado = pacienteRepository.findById(id).orElseThrow( ()
                -> new RuntimeException("No se encontro el paciente con id:" + id));
        if(buscado != null){
            pacienteRepository.delete(buscado);
        }
        return "Se elimino el paciente con id: " + id;
    }

    public Pacientes guardarPaciente(Pacientes paciente){
        return pacienteRepository.save(paciente);
    }
}

