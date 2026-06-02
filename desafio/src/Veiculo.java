public abstract class Veiculo {
    private String placa;
    private double custoFixo;

    public Veiculo(String placa, double custoFixo) {
        if (placa == null || placa.length() != 7) {
            throw new PlacaInvalidaException("A placa deve possuir 7 caracteres");
        }

        this.placa = placa;
        this.custoFixo = custoFixo;
    }

    public abstract double calcularCustoTotal();

    public String getPlaca() {
        return placa;
    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }
}
