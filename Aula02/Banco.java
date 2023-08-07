package Aula02;

import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<>();

    public void criarConta(String cliente, int numero, double saldo){
        Conta novaConta = new Conta(cliente, numero, saldo);
        contas.add(novaConta);
    }

    public boolean verificarNumeroConta(int numero) {
        for (Conta c : contas) {
            if (c.equals(numero)) {
                return true;
            }
        }
        return false;
    }

    public void buscarConta(int numeroConta){
        for (Conta c : contas) {
            if (c != null && c.numero == numeroConta) {
                System.out.println("Número da conta: " + c.numero + "\nCliente: " + c.cliente + "\nSaldo: " + c.saldo);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void depositar(int numero, double quantia){
        for (Conta c : contas) {
            if (c != null && c.numero == numero) {
                c.depositar(quantia);
                System.out.println("Depósito de " + quantia + " feito na conta número " + c.numero + ". Novo saldo: " + c.saldo);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void sacar(int numero, double quantia){
        for (Conta c : contas) {
            if (c != null && c.numero == numero) {
                Double valorSacado = c.sacar(quantia);
                if (valorSacado > 0) {
                    System.out.println("Saque de " + valorSacado + " feito na conta número " + c.numero + ". Novo saldo: " + c.saldo);
                }
                return;
            }
        }
        System.out.println("Conta não encontrada ou saldo insuficiente.");
    }
}
