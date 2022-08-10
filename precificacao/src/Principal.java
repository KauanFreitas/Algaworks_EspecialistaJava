public class Principal {

    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto produto = new Produto();

        produto.alterarPrecoCusto(100);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(produto, 20);

        System.out.printf("Preço: %.2f%n",produto.precoCusto);

        System.out.printf("Preço: %.2f%n",produto.precoVenda);
    }
}
