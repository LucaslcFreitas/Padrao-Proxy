public class Funcionario {
    private String nome;
    private boolean acessoProntuario;

    public Funcionario(String nome, boolean acessoProntuario) {
        this.nome = nome;
        this.acessoProntuario = acessoProntuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAcessoProntuario() {
        return acessoProntuario;
    }

    public void setAcessoProntuario(boolean acessoProntuario) {
        this.acessoProntuario = acessoProntuario;
    }
}
