package Aula07;

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;


    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }


    public void inserir() {
        if(!cheia()){
            topo = topo + 1;
            dados[topo] = 10;

        } else {
            System.out.println("A ilha esta cheia!");
        }
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }


    public boolean vazia() {
        return topo == -1;
    }

    public void remove() {
        if(!vazia()){
            dados[topo] = 0;
            topo = topo -1;
        } else {
            System.out.println("A pilha esta vazia");
        }
    }

    public void imprime(){
        for (int dado : dados) {
            System.out.println(dado);
        }
    }

}