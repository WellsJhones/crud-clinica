package med.voll.api.domain.medico;

public record DadosListagemMedico(String nome, String email, Especialidade especialidade, String crm, Long id) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getEspecialidade(), medico.getCrm(), medico.getId());
    }

}
