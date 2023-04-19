package med.voll.api.paciente;

public record DadosListagemPacientes(
        Long id,
        String name,
        String cpf,
        String email)
{
    public DadosListagemPacientes(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getCpf(), paciente.getEmail());
    }
}