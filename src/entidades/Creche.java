package entidades;

public class Creche extends Usuario {
    public String senha;
    public String unidade;
    public String horarioFuncionamento;

    public Creche(String nome, String senha, String unidade, String horarioFuncionamento) {
        this.nome = nome;
        this.senha = senha;
        this.unidade = unidade;
        this.horarioFuncionamento = horarioFuncionamento;
    }
}
