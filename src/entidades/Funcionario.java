package entidades;

public class Funcionario extends Usuario {
    public String classe;
    public String aniversario;
    public String horarioTrabalho;
    public String login;
    public String senha;

    public Funcionario(String nome, String classe, String aniversario, String horarioTrabalho, String login, String senha) {
        this.nome = nome;
        this.classe = classe;
        this.aniversario = aniversario;
        this.horarioTrabalho = horarioTrabalho;
        this.login = login;
        this.senha = senha;
    }
}
