public class Main {
    public static void main(String[] args) {

        Funcionario gerente =
                new Gerente("Carlos", 8000.0, 2000.0);

        Funcionario desenvolvedor =
                new Desenvolvedor("Ana", 5000.0, 20);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$ " + gerente.calcularSalario());

        System.out.println();

        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário: R$ " + desenvolvedor.calcularSalario());
    }
}