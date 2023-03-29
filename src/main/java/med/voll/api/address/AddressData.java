package med.voll.api.address;

public record AddressData(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cep,
        String cidade,
        String uf
) {
}
