package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endreco.Endereco;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @Embedded
    private Endereco endereco;

    public Paciente(DadosCadastroPaciente data) {
        this.nome = data.nome();
        this.email = data.email();
        this.telefone = data.telefone();
        this.endereco = new Endereco(data.endereco());
    }
}
