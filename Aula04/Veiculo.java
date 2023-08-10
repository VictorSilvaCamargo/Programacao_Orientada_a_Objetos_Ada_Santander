package Aula04;

public abstract class Veiculo {
    private String placa;
    private String cor;
    private String modelo;
    public Veiculo(String placa, String cor, String modelo){
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;

    }
    public void exibirDados(){
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }


}