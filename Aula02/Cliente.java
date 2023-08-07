package Aula02;

import java.util.Objects;

public class Cliente {
    String nome;
    double CPF;
    String email;

    public Cliente(String nome, double CPF, String email){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public void equals(Cliente cliente1, Cliente cliente2){

        if(Objects.equals(cliente1.CPF, cliente2.CPF)){
            System.out.println("Os clientes são iguais!");
        } else{
            System.out.println("Os clientes não são iguais!");
        }

    }

    public String toString(Cliente cliente){

        return "Nome: " + cliente.nome + "\nCPF: " + cliente.CPF + "\nEmail: " + cliente.email;
    }
}
