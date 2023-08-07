package Aula02;

import java.util.Objects;

public class Conta {
    String cliente;
    int numero;
    Double saldo;

    public Conta(String cliente, int numero, Double saldo){
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double depositar(double quantia){
        return this.saldo = saldo + quantia;
    }

    public Double sacar(double quantia) {
        double dinheiroSaque;
        if(quantia > saldo){
            System.out.println("Saldo insuficiente");
            dinheiroSaque = 0.0;
        } else {
            System.out.println("Sacando...");
            dinheiroSaque = quantia;
        }
        return this.saldo = saldo - dinheiroSaque;
    }

    public boolean equals(int numero) {
        return this.numero == numero;
    }

    public String toString(){
        return "Cliente: \n" + cliente + "Número da conta: \n" + numero + "Saldo: \n" + saldo;
    }
}
