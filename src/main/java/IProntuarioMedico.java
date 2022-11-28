import java.util.List;

public interface IProntuarioMedico {
    List<String> obterDadosProntuario();
    List<String> obterGravidade(Funcionario funcionario);
}
