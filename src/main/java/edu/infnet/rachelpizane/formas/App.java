package edu.infnet.rachelpizane.formas;

public class App {
    public static void main(String[] args) {
        // Solução das questões 10, 11 e 12

        Circulo circulo = new Circulo(3.0);
        Esfera esfera = new Esfera(5.0);

        System.out.println("[CÍRCULO]");
        System.out.printf("Área: %.2f", circulo.calcularArea());
        System.out.print("\n");

        System.out.println("[ESFERA]");
        System.out.printf("Volume: %.2f", esfera.calcularVolume());
        System.out.print("\n");
    }
}
