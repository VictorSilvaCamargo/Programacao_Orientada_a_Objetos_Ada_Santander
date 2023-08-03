package Aula01;

class Contato {
    String telefone;
    String nome;

    public Contato(String telefone, String nome){
        this.telefone = telefone;
        this.nome = nome;
    }

    public void ligar(){
        System.out.println("Ligando para: " + telefone);
    }
}
