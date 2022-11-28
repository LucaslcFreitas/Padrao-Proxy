import java.util.List;

public class ProntuarioMedicoProxy implements IProntuarioMedico {
    private ProntuarioMedico prontuarioMedico;
    private Integer codigo;

    public ProntuarioMedicoProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterDadosProntuario() {
        if (prontuarioMedico == null) {
            this.prontuarioMedico = new ProntuarioMedico(codigo);
        }
        return this.prontuarioMedico.obterDadosProntuario();
    }

    @Override
    public List<String> obterGravidade(Funcionario funcionario) {
        if (!funcionario.isAcessoProntuario()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (prontuarioMedico == null) {
            this.prontuarioMedico = new ProntuarioMedico(this.codigo);
        }
        return this.prontuarioMedico.obterGravidade(funcionario);
    }
}
