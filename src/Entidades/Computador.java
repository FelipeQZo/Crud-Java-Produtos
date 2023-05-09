package Entidades;

public class Computador extends Produto {


    public Computador(long id, String nome, String modelo, int preco) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
