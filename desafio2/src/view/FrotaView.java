package view;

import controller.FrotaController;
import model.*;

import java.util.Scanner;

public class FrotaView {

    private Scanner scanner = new Scanner(System.in);
    private FrotaController controller = new FrotaController();

    public void iniciar() {

        int opcao;

        do {

            System.out.println("\n1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Caminhão");
            System.out.println("3 - Listar Veículos");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarCarro();
                    break;

                case 2:
                    cadastrarCaminhao();
                    break;

                case 3:
                    listarVeiculos();
                    break;
            }

        } while (opcao != 0);
    }

    private void cadastrarCarro() {

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Portas: ");
        int portas = scanner.nextInt();

        controller.adicionarVeiculo(
            new Carro(placa, modelo, portas)
        );
    }

    private void cadastrarCaminhao() {

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Capacidade: ");
        double carga = scanner.nextDouble();

        controller.adicionarVeiculo(
            new Caminhao(placa, modelo, carga)
        );
    }

    private void listarVeiculos() {

        for (Veiculo v : controller.listarVeiculos()) {
            System.out.println(v);
        }
    }
}