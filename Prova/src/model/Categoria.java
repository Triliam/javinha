package model;

public class Categoria {

    private int codCategoria;
    private String nome;


    public Categoria() {

    }

    public Categoria(int codCategoria, String nome) {
        this.codCategoria = codCategoria;
        this.nome = nome;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "codCategoria=" + codCategoria +
                ", nome='" + nome + '\'' +
                '}';
    }
}
