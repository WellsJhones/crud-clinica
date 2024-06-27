package med.voll.api.paciente;

import med.voll.api.medico.Endereco;

public record DadosDetalhamentoPaciente(String nome, String email, Endereco endereco, String cpf, String telefone,
        Long id) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getEndereco(), paciente.getCpf(), paciente.getTelefone(),
                paciente.getId());
    }

}
