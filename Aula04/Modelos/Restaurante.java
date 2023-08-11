package Aula04.Modelos;

import java.util.ArrayList;

public class Restaurante {
    private final String nomeRestaurante;
    private final String estado;
    private final String bairro;
    private final String rua;
    private final String numero;
    private ArrayList<Prato> pratos = new ArrayList<>();
    private ArrayList<Restaurante> restaurantesCadastrados = new ArrayList<>();
    private ArrayList<Pedido> pedidosRecebidos = new ArrayList<>();

    public Restaurante(String nomeRestaurante, String estado, String bairro, String rua, String numero) {
        this.nomeRestaurante = nomeRestaurante;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        restaurantesCadastrados.add(this);
    }

    public String getNomeRestaurante(){
        return nomeRestaurante;
    }
    public String getEstado(){
        return estado;
    }
    public String getBairro(){
        return bairro;
    }
    public String getRua(){
        return rua;
    }
    public String getNumero(){
        return numero;
    }

    public void adicionarPratos(Prato prato){
        pratos.add(prato);
        System.out.println("Prato " + prato.getNomePrato() + "' cadastrado com sucesso!");
    }

    public void listarPratos(){
        for(Prato p : pratos){
            System.out.println("Nome do prato: " + p.getNomePrato());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Preço: " + p.getValor());
            System.out.println();
        }
    }
    public void adicionarPedido(Pedido pedido) {
        pedidosRecebidos.add(pedido);
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidosRecebidos) {
            System.out.println("Bairro de entrega: " + pedido.getBairroEntrega());
            System.out.println("Rua de entrega: " + pedido.getRuaEntrega());
            System.out.println("Número de entrega: " + pedido.getNumeroEntrega());
            System.out.println("Valor total: " + pedido.getValorTotal());

            System.out.println("Pratos pedidos:");
            for (Prato prato : pedido.getPratosPedidos()) {
                System.out.println("- " + prato.getNomePrato() + " (" + prato.getValor() + ")");
            }

            System.out.println("==============");
        }
    }
    public ArrayList<Prato> getPratos() {
        return pratos;
    }

}
