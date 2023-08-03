package Aula01;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.nome);
    }

    public void deletar(Contato contato){
        System.out.println("Deletando o contato " + contato.nome);
        contatos.remove(contato);
    }

    public void buscar(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.nome.equals(nome)) {
                System.out.println("Nome: " + contato.nome);
                System.out.println("Telefone: " + contato.telefone);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não encontrado");
        }
    }


}
