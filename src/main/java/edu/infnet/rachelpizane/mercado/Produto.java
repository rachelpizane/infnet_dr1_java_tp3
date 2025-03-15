package edu.infnet.rachelpizane.mercado;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        validarPreco(preco);
        validarQuantidade(quantidadeEmEstoque);

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(double preco) {
        validarPreco(preco);
        this.preco = preco;
    }

    public void alterarQuantidade(int quantidade) {
        validarQuantidade(quantidade);
        this.quantidadeEmEstoque = quantidade;
    }

    public String exibirInformacoes() {
        return String.format("Nome: %s | Preço: R$ %.2f | Quantidade em estoque: %d", this.nome, this.preco, this.quantidadeEmEstoque);
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
        validarPreco(preco);
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        validarQuantidade(quantidadeEmEstoque);
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    private void validarPreco(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
    }

    private void validarQuantidade(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
    }
}
