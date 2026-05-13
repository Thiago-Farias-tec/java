public class Main {

    public static void main(String[] args) {

        Vendedor v = new Vendedor(
            "Thiago",
            "123",
            3000,
            500
        );

        Diretor d = new Diretor(
            "Carlos",
            "456",
            8000,
            "Financeiro"
        );

        System.out.println(v.getNome());
        System.out.println(v.getComissao());

        System.out.println(d.getNome());
        System.out.println(d.getDepartamento());
    }
}