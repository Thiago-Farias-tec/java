package controller;

import model.*;
import repository.VeiculoRepository;

import java.util.List;

public class FrotaController {

    private List<Veiculo> veiculos;
    private VeiculoRepository repository;

    public FrotaController() {
        repository = new VeiculoRepository();
        veiculos = repository.carregar();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        repository.salvar(veiculos);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }
}