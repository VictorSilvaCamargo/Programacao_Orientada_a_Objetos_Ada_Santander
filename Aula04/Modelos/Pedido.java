package Aula04.Modelos;
import java.util.ArrayList;

public class Pedido {
    private final String bairroEntrega;
    private final String ruaEntrega;
    private final String numeroEntrega;
    private double valorTotal;
    private final ArrayList<Prato> pratosPedidos = new ArrayList<>();
    private final Restaurante restaurante;

    public Pedido(String bairroEntrega, String ruaEntrega, String numeroEntrega, double valorTotal, Restaurante restaurante) {
        this.bairroEntrega = bairroEntrega;
        this.ruaEntrega = ruaEntrega;
        this.numeroEntrega = numeroEntrega;
        this.valorTotal = valorTotal;
        this.restaurante = restaurante;
    }
    public ArrayList<Prato> getPratosPedidos() {
        return pratosPedidos;
    }

    public void adicionarPrato(Prato prato) {
        pratosPedidos.add(prato);
    }
    public String getBairroEntrega(){
        return bairroEntrega;
    }
    public String getNumeroEntrega(){
        return numeroEntrega;
    }
    public String getRuaEntrega(){
        return ruaEntrega;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Restaurante getRestaurante() {
        return restaurante;
    }


}
