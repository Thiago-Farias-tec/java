package repository;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoRepository {

    private final String arquivo = "veiculos.txt";

    public void salvar(List<Veiculo> veiculos) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(arquivo))) {

            for (Veiculo v : veiculos) {
                bw.write(v.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar.");
        }
    }

    public List<Veiculo> carregar() {

        List<Veiculo> veiculos = new ArrayList<>();

        File file = new File(arquivo);

        if (!file.exists()) {
            return veiculos;
        }

        try (BufferedReader br = new BufferedReader(
                new FileReader(file))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(";");

                if (dados[0].equals("CARRO")) {

                    veiculos.add(
                        new Carro(
                            dados[1],
                            dados[2],
                            Integer.parseInt(dados[3])
                        )
                    );

                } else if (dados[0].equals("CAMINHAO")) {

                    veiculos.add(
                        new Caminhao(
                            dados[1],
                            dados[2],
                            Double.parseDouble(dados[3])
                        )
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao carregar.");
        }

        return veiculos;
    }
}