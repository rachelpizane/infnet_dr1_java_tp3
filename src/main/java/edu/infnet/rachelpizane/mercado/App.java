package edu.infnet.rachelpizane.mercado;

public class App {
    public static void main(String[] args) {
        // Solução das questões 2, 3, 4, 5 e 6

        Produto leite = new Produto("Leite", 3.5, 34);
        Produto cafe = new Produto("Café", 25.0, 12);

        System.out.println("[PRODUTO 1]");
        System.out.println(leite.exibirInformacoes());
        System.out.print("\n");

        System.out.println("[PRODUTO 2]");
        System.out.println(cafe.exibirInformacoes());
        System.out.print("\n");

        System.out.println("[PRODUTO 1] - Após reajuste");
        leite.alterarPreco(4.0);
        leite.alterarQuantidade(17);
        System.out.println(leite.exibirInformacoes());
        System.out.print("\n");

        System.out.println("[PRODUTO 2] - Após reajuste");
        cafe.alterarPreco(30.0);
        cafe.alterarQuantidade(8);
        System.out.println(cafe.exibirInformacoes());
        System.out.print("\n");

        cafe.setPreco(26.90);
        System.out.println("[PRODUTO 2] - Novo preço");
        System.out.printf("Nome: %s -> Preço: R$ %.2f", cafe.getNome(), cafe.getPreco());
    }
}
