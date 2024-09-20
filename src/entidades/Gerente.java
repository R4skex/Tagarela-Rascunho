package entidades;

public class Gerente extends Usuario {
    public String aniversario;
    public String login;
    public String senha;

    public Gerente(String nome, String aniversario, String login, String senha) {
        this.nome = nome;
        this.aniversario = aniversario;
        this.login = login;
        this.senha = senha;
    }
}
