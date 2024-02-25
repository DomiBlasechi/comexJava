package br.com.alura.comex.testes;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteMenu {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner menu = new Scanner(System.in);
        while (opcao != 4) {
            System.out.print("##------BEM-VINDO A COMEX!!-----##\n\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Clientes          |\n");
            System.out.print("| Opção 2 - Produtos          |\n");
            System.out.print("| Opção 3 - Cadastrar cliente |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.println("Digite uma opção: ");
            try {
                opcao = Integer.parseInt(menu.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("\nExibindo lista de clientes.\n");
                        break;
                    case 2:
                        System.out.print("\nExibindo lista de produtos.\n");
                        break;
                    case 3:
                        System.out.print("\nCadastro de novos clientes.\n");
                        break;
                    case 4:
                        System.out.print("\nVocê escolheu encerrar a aplicação.");
                        break;
                    default:
                        System.out.print("\nOpção inválida! Digite um número de 1 a 4.");
                        break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Caractere não permitido, digite de 1 a 4");
            }
        }
    }
}