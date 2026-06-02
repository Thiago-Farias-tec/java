public class Main {

    public static void main(String[] args) {

        GerenciadorFrota gerenciador = new GerenciadorFrota();

    
        try {
            Carro carroErro =
                    new Carro("ABC12", 30000, 10000);

        } catch (PlacaInvalidaException e) {

            System.out.println(
                    "Exceção capturada: "
                    + e.getMessage());
        }

        Carro carro =
                new Carro("ABC1234", 50000, 20000);

        Caminhao caminhao =
                new Caminhao("XYZ5678", 120000, 8.5);

        gerenciador.adicionarVeiculo(carro);
        gerenciador.adicionarVeiculo(caminhao);

  
        gerenciador.salvarDadosEmArquivo("frota.txt");

   
        System.out.println("\nConteúdo do arquivo:");

        gerenciador.lerDadosDoArquivo("frota.txt");
    }
}