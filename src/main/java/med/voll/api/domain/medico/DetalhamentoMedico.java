package med.voll.api.domain.medico;

import med.voll.api.domain.endreco.Endereco;

public record DetalhamentoMedico(Long id,
                                 String nome,
                                 String crm,
                                 String emial,
                                 String telefone,
                                 Especialidade especialidade,
                                 Endereco endereco) {
    public DetalhamentoMedico (Medico medico) {
        this (medico.getId(),
                medico.getNome(),
                medico.getCrm(),
                medico.getEmail(),
                medico.getTelefone(),
                medico.getEspecialidade(),
                medico.getEndereco());
    }
}
