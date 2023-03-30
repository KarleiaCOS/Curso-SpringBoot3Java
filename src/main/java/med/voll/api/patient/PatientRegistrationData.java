package med.voll.api.patient;

import med.voll.api.address.AddressData;

public record PatientRegistrationData(
        String nome,
        String email,
        String telefone,
        String cpf,
        AddressData endereco
) {
}
