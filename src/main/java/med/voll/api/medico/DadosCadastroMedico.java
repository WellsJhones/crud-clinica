package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(
        @NotBlank String nome,
        @NotBlank @Pattern(regexp = "\\d{4,6}") String crm,
        @Email String email,
        @NotNull Especialidade especialidade,
        @NotNull @Valid DadosEndereco endereco,
        @NotBlank String telefone) {

}
// AIzaSyCle5Zu43ehb2wqCP0eeNGnDIlyjRljEWg