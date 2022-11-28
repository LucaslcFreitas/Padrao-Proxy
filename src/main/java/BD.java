import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, ProntuarioMedico> prontuarios = new HashMap<>();

    public static ProntuarioMedico getProntuario(Integer codigo) {
        return prontuarios.get(codigo);
    }

    public static void addProntuario(ProntuarioMedico prontuario) {
        prontuarios.put(prontuario.getCodigo(), prontuario);
    }
}
