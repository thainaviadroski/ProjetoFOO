package com.meuprojeto.componentes;

import java.util.Scanner;

public final class MenuGeral {

    private MenuGeral() {
    }

    public static void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU GERAL =====");
            System.out.println("1 - Clientes");
            System.out.println("2 - Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1 -> MenuCliente.exibir(scanner);
                case 2 -> MenuProduto.exibir(scanner);
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    static int lerOpcao(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
