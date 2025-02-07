package Controller;

import Model.Pacientes;
import Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Pacientes")
public class PacienteController {
    @Autowired
    PacienteService pacienteService;

    @GetMapping("/todos")
    public ResponseEntity<List<Pacientes>> buscarTodos(){
        return ResponseEntity.ok(pacienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pacientes> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(pacienteService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pacientes> actualizar(@RequestBody Pacientes paciente, @PathVariable Long id){
        return ResponseEntity.ok(pacienteService.actualizarPaciente(paciente, id));
    }

    @PostMapping("/crear")
    public ResponseEntity<Pacientes> guardar(@RequestBody Pacientes paciente){
        return ResponseEntity.ok(pacienteService.guardarPaciente(paciente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Long id){
       String eliminado = pacienteService.eliminarPaciente(id);
       if(eliminado != null){
           return ResponseEntity.ok(eliminado);
       }
       return ResponseEntity.notFound().build();
    }


}
