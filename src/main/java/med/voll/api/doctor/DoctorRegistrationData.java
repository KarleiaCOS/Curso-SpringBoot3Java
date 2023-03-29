package med.voll.api.doctor;

import med.voll.api.address.AddressData;

public record DoctorRegistrationData(
        String nome,
        String email,
        String crm,
        Especialty especialidade,
        AddressData endereco
)
{
}
