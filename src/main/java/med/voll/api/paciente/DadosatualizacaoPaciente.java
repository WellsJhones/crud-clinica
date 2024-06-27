package med.voll.api.paciente;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosEndereco;

public record DadosatualizacaoPaciente(Long id,
                String nome,
                String telefone,
                @Valid DadosEndereco endereco) {

}
