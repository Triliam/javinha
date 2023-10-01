package model;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    public Produto() {

    }

    public Produto(int codigo, String nome, double preco, int quantidade, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void entradaEstoque(int qtd) {
        //add quantidade no estoque
        this.quantidade += qtd;

    }

    public void saidaEstoque(int qtd) {
        //remover qtd do estoque
        this.quantidade -= qtd;
    }

    public int getSaldo() {
        //qtd atual do estoque
        return this.quantidade;

    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", categoria=" + categoria +
                '}';
    }
}
