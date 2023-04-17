package med.voll.api.paciente;

public record DadosListagemPacientes(String name, String cpf, String email) {

    public DadosListagemPacientes(Paciente paciente){
        this(paciente.getNome(), paciente.getCpf(), paciente.getEmail());
    }
}