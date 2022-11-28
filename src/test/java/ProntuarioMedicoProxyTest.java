import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProntuarioMedicoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addProntuario(new ProntuarioMedico(1, "Pneumonia", "Possui inflamação nos pulmões. Deve-se manter repouso total", "Alimentação normal", "Puco Urgente"));
        BD.addProntuario(new ProntuarioMedico(2, "Cardiopatia", "Efetuou cirurgia no coração e possui diminuição das funções cardiacas", "Alimentação branda", "Muito Urgente"));
    }

    @Test
    void deveRetornarDadosProntuario() {
        ProntuarioMedicoProxy prontuario = new ProntuarioMedicoProxy(1);

        assertEquals(Arrays.asList("Pneumonia", "Possui inflamação nos pulmões. Deve-se manter repouso total", "Alimentação normal"), prontuario.obterDadosProntuario());
    }

    @Test
    void deveRetornarGravidadeProntuario() {
        Funcionario funcionario = new Funcionario("Carlos", true);
        ProntuarioMedicoProxy prontuario = new ProntuarioMedicoProxy(2);

        assertEquals(Arrays.asList("Muito Urgente"), prontuario.obterGravidade(funcionario));
    }

    @Test
    void deveRetonarExcecaoFuncionarioNaoAutorizadoConsultarGravidade() {
        try {
            Funcionario funcionario = new Funcionario("Joana", false);
            ProntuarioMedicoProxy prontuario = new ProntuarioMedicoProxy(2);

            prontuario.obterGravidade(funcionario);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}