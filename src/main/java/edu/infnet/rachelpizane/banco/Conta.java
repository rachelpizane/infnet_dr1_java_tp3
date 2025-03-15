package edu.infnet.rachelpizane.banco;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void saca(double valor) {
        validarValor(valor);

        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } 

        this.saldo -= valor;
    }

    public void deposita(double valor) {
        validarValor(valor);

        this.saldo += valor;
    }

    public double calcularRendimento() {
        return this.saldo * 0.1;
    }

    public String calcularRendimentoFormatado() {
        return String.format("%.2f", calcularRendimento());
    }

    private void validarValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", dataAbertura='" + dataAbertura + '\'' +
                '}';
    }
}
