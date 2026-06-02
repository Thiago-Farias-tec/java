import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {

    private List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArquivo) {

        try (BufferedWriter bw =
                new BufferedWriter(new FileWriter(nomeArquivo))) {

            for (Veiculo v : frota) {
                bw.write(v.toString());
                bw.newLine();
            }

            System.out.println("Arquivo salvo com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: "
                    + e.getMessage());
        }
    }

    public void lerDadosDoArquivo(String nomeArquivo) {

        try (BufferedReader br =
                new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: "
                    + e.getMessage());
        }
    }
}