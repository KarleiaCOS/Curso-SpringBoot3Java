package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.DadosListagemPacientes;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }
    @GetMapping
    public List<DadosListagemPacientes> listar() {
        return repository.findAll().stream().map(DadosListagemPacientes::new).toList();
    }
}
