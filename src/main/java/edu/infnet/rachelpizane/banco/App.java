package edu.infnet.rachelpizane.banco;

public class App {
    public static void main(String[] args) {
        // Solução das questões 7, 8 e 9

        Conta conta = new Conta("Carla Garcia", 2561, "45-6", 1000, "14/05/2021");

        System.out.println("[CONTA CRIADA]");
        System.out.println(conta.toString());
        System.out.printf("Rendimento: R$ %.2f\n\n", conta.calcularRendimento());


        conta.deposita(500.80);

        System.out.println("[APÓS O DEPÓSITO]");
        System.out.println(conta.toString());
        System.out.print("\n");

        conta.saca(200.20);

        System.out.println("[APÓS O SAQUE]");
        System.out.println(conta.toString());
        System.out.printf("Rendimento: R$ %.2f", conta.calcularRendimento());
        System.out.print("\n");
    }
}
