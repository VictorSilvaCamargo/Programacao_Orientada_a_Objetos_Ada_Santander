package Aula01;

class Contato {
    String telefone;
    String nome;

    public Contato(String telefone, String nome){
        this.telefone = telefone;
        this.nome = nome;
    }

    public void getNome(){
        System.out.println(nome);
    }
    public void getTelefone(){

        System.out.println(telefone);
    }
    public void ligar(){
        System.out.println("Ligando para: " + telefone);
    }
}
