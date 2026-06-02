public class Carro extends Veiculo implements Tributavel {
    private int quilometragem;

    public Carro(String placa, double custoFixo, int quilometragem){
        super(placa, custoFixo);
        this.quilometragem= quilometragem;
    }

    @Override
    public double calcularCustoTotal(){
        return getCustoFixo() + (quilometragem * 0.15);
    }

    @Override
    public double calcularIPVA(){
        return getCustoFixo() * 0.04;
    }

    @Override
    public String toString(){
        return "Carro | Placa: " + getPlaca()
                + " | Custo Total: " + calcularCustoTotal()
                + " | IPVA: " + calcularIPVA();
    }
}
