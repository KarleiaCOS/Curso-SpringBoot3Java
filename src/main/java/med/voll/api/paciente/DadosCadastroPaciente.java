package med.voll.api.paciente;

import med.voll.api.endreco.DadosEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
) {
}
