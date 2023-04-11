package med.voll.api.endreco;

public record DadosEndereco(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cep,
        String cidade,
        String uf
) {
}
