public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3000.00);
        Produto p2 = new Produto("Mouse", 100.00);
        Produto p3 = new Produto("Teclado", 200.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        System.out.println("Total antes do desconto: R$ "
                + carrinho.calcularTotal());

        carrinho.aplicarDescontoGeral(10);

        System.out.println("Total após desconto: R$ "
                + carrinho.calcularTotal());
    }
}