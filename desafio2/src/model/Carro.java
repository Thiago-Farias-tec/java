package model;

public class Carro extends Veiculo implements Tributavel {

    private int portas;

    public Carro(String placa, String modelo, int portas) {
        super(placa, modelo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public double calcularImposto() {
        return 500.0;
    }

    @Override
    public String toString() {
        return "CARRO;" +
               getPlaca() + ";" +
               getModelo() + ";" +
               portas;
    }
}