package entidades;

public class Pais extends Usuario {
    public String endereco;
    public String telefone;
    public String email;
    public Filho filho;

    public Pais(String nome, String endereco, String telefone, String email, Filho filho) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.filho = filho;
    }
}
