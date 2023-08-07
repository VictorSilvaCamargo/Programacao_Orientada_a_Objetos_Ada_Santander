package Aula02;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Buscar conta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    String cliente, email;
                    int numero;
                    double saldo = 0.0;
                    Double CPF;

                    do {
                        System.out.print("Digite o número da conta: ");
                        numero = scanner.nextInt();
                        if (banco.verificarNumeroConta(numero)) {
                            System.out.println("Número de conta já existente. Digite um número de conta diferente.");
                        }
                    } while (banco.verificarNumeroConta(numero));

                    System.out.print("Digite o nome do cliente: ");
                    cliente = scanner.next();
                    System.out.print("Digite o CPF do cliente (sem . e -): ");
                    CPF = scanner.nextDouble();
                    System.out.print("Digite seu melhor email: ");
                    email = scanner.next();

                    banco.criarConta(cliente, numero, saldo);
                    Cliente novoCliente = new Cliente(cliente, CPF, email);
                    System.out.println("Conta e Cliente criados com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o número da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(numero, valorDeposito);
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(numero, valorSaque);
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    numero = scanner.nextInt();
                    banco.buscarConta(numero);
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
