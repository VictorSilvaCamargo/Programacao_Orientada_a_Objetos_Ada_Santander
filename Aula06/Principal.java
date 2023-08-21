package Aula06;

public class Principal {

    public static void imprimirLista(Lista lista){
        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    public static void main(String[] args) {
        Lista lista = new ArrayLista();

        lista.add("Primeiro elemento");
        lista.add("Segundo elemento");
        lista.add(1);
        lista.add(2);

        imprimirLista(lista);
        Lista lista2 = new ArrayLista();
        lista2.add("Meu nome");
        lista2.add("Outro nome");
    }
}
