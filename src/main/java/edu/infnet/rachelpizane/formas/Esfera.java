package edu.infnet.rachelpizane.formas;

public class Esfera {
    static final double PI = Math.PI;
    private double raio;

    public Esfera(double raio) {
        validarRaio(raio);
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * PI * Math.pow(this.raio, 3);
    }

    private void validarRaio(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio inválido");
        }
    }
}
