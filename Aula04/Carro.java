package Aula04;

public class Carro extends Veiculo {
    private String tipoCombustivel;
    private int qtdPortas;
    public Carro(String placa, String cor, String modelo, String tipoCombustivel, int qtdPortas){
        super(placa,cor,modelo);
        this.tipoCombustivel = tipoCombustivel;
        this.qtdPortas = qtdPortas;

    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade portas: " + qtdPortas);
        System.out.println("Tipo combustivel: " + tipoCombustivel);
    }
}