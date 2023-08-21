package Aula07;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int selecionador = -1;

        System.out.println("Insira o tamanho da capacidade da pilha:");
        int capacidade = scanner.nextInt();

        Pilha pilha = new Pilha(capacidade);

        while (selecionador != 0) {
            System.out.println("Selecione as opções:");
            System.out.println("Opção 1: inserir na pilha");
            System.out.println("Opção 2: Verificar se a pilha está cheia");
            System.out.println("Opção 3: Verificar se a pilha está vazia");
            System.out.println("Opção 4: Remover");
            System.out.println("Opção 5: Imprimir");
            System.out.println("Opção 0: Sair");

            selecionador = scanner.nextInt();

            if (selecionador == 1) {
                pilha.inserir();
            } else if (selecionador == 2) {
                System.out.println(pilha.cheia());
            } else if (selecionador == 3) {
                System.out.println(pilha.vazia());
            } else if (selecionador == 4) {
                pilha.remove();
            } else if (selecionador == 5) {
                pilha.imprime();
            }

        }
    }
}