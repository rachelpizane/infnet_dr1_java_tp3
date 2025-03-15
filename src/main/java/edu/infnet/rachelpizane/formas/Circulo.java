package edu.infnet.rachelpizane.formas;

public class Circulo {
    static final double PI = Math.PI;
    private double raio;

    public Circulo(double raio) {
        validarRaio(raio);
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * Math.pow(this.raio, 2);
    }

    private void validarRaio(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio inválido");
        }
    }
}
