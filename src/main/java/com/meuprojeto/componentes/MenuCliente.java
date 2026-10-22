package com.meuprojeto.componentes;

import java.util.Scanner;

public final class MenuCliente {

    private MenuCliente() {
    }

    public static void exibir(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n===== MENU CLIENTE =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Deletar cliente");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = MenuGeral.lerOpcao(scanner);

            switch (opcao) {
                case 1 -> System.out.println("Cadastrar cliente");
                case 2 -> System.out.println("Listar clientes");
                case 3 -> System.out.println("Buscar cliente");
                case 4 -> System.out.println("Atualizar cliente");
                case 5 -> System.out.println("Deletar cliente");
                case 0 -> System.out.println("Voltando ao menu geral...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
