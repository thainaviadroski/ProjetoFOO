package com.meuprojeto.componentes;

import java.util.Scanner;

public final class MenuProduto {

    private MenuProduto() {
    }

    public static void exibir(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n===== MENU PRODUTO =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Atualizar produto");
            System.out.println("5 - Deletar produto");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = MenuGeral.lerOpcao(scanner);

            switch (opcao) {
                case 1 -> System.out.println("Cadastrar produto");
                case 2 -> System.out.println("Listar produtos");
                case 3 -> System.out.println("Buscar produto");
                case 4 -> System.out.println("Atualizar produto");
                case 5 -> System.out.println("Deletar produto");
                case 0 -> System.out.println("Voltando ao menu geral...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
