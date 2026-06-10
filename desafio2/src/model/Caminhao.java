package model;

public class Caminhao extends Veiculo implements Tributavel {

    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, double capacidadeCarga) {
        super(placa, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public double calcularImposto() {
        return 1000.0;
    }

    @Override
    public String toString() {
        return "CAMINHAO;" +
               getPlaca() + ";" +
               getModelo() + ";" +
               capacidadeCarga;
    }
}