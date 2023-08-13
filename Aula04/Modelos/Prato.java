package Aula04.Modelos;

public class Prato {
    private final String nomePrato;
    private final String descricao;
    private final double valor;

    public Prato(String nomePrato,String descricao, double valor){
        this.nomePrato=nomePrato;
        this.descricao=descricao;
        this.valor=valor;
    }
     public String getNomePrato(){
        return nomePrato;
     }
    public String getDescricao(){
        return descricao;
    }
    public double getValor(){
        return valor;
    }


}
