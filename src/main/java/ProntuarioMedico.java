import java.util.Arrays;
import java.util.List;

public class ProntuarioMedico implements IProntuarioMedico {
    private Integer codigo;
    private String enfermidade;
    private String descricao;
    private String tipoAlimentacao;
    private String gravidade;

    public ProntuarioMedico(Integer codigo) {
        this.codigo = codigo;
        ProntuarioMedico prontuarioMedico = BD.getProntuario(codigo);
        this.enfermidade = prontuarioMedico.enfermidade;
        this.descricao = prontuarioMedico.descricao;
        this.tipoAlimentacao = prontuarioMedico.tipoAlimentacao;
        this.gravidade = prontuarioMedico.gravidade;
    }

    public ProntuarioMedico(Integer codigo, String enfermidade, String descricao, String tipoAlimentacao, String gravidade) {
        this.codigo = codigo;
        this.enfermidade = enfermidade;
        this.descricao = descricao;
        this.tipoAlimentacao = tipoAlimentacao;
        this.gravidade = gravidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterDadosProntuario() {
        return Arrays.asList(this.enfermidade, this.descricao, this.tipoAlimentacao);
    }

    @Override
    public List<String> obterGravidade(Funcionario funcionario) {
        return Arrays.asList(this.gravidade);
    }
}
