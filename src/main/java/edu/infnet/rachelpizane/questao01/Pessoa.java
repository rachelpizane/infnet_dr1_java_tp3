package edu.infnet.rachelpizane.questao01;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String saudacao() {
        return String.format("Olá, meu nome é %s e tenho %d anos.", this.nome, this.idade);
    }

    public void fazerAniversario() {
        this.idade++;
    }
}
