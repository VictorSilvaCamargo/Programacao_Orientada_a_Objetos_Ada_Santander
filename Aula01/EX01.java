package Aula01;

public class EX01 {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda();

        Contato contato01 = new Contato("1199999-9999", "João");
        Contato contato02 = new Contato("1188888-8888", "Maria");

        minhaAgenda.adicionarContato(contato01);
        minhaAgenda.adicionarContato(contato02);


        minhaAgenda.buscar("Maria");
        minhaAgenda.buscar("João");


        contato01.ligar();
        contato02.ligar();

        minhaAgenda.buscar("João");



    }
}
