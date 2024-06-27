package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import med.voll.api.domain.medico.DadosEndereco;

public record DadosatualizacaoPaciente(Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco) {

}
