package Aula01;

public class EX01 {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda();

        System.out.println("-> Adicionando os contatos: ");
        Contato contato01 = new Contato("1199999-9999", "João");
        Contato contato02 = new Contato("1188888-8888", "Maria");


        minhaAgenda.adicionarContato(contato01);
        minhaAgenda.adicionarContato(contato02);
        System.out.println();

        System.out.println("-> Buscando contatos: ");
        minhaAgenda.buscar("Maria");
        minhaAgenda.buscar("João");
        System.out.println();

        System.out.println("-> Ligando para os contatos: ");
        contato01.ligar();
        contato02.ligar();
        System.out.println();

        System.out.println("-> Deletando Maria: ");
        minhaAgenda.deletar(contato02);
        System.out.println();

        System.out.println("-> Verificando se Maria foi deletada:");
        minhaAgenda.buscar("Maria");



    }
}
