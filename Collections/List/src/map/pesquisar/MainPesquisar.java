package map.pesquisar;

public class MainPesquisar {

	public static void main(String[] args) {
		EstoqueProduto estoque = new EstoqueProduto();
		estoque.adicionarProduto(1L, "Lata de Atum", 8.89, 10);
		estoque.adicionarProduto(2L, "Lata de Milho", 5.10, 20);
		estoque.adicionarProduto(3L, "Leite", 6.10, 30);
		estoque.adicionarProduto(4L, "Quilo de café", 12.89, 10);
		estoque.adicionarProduto(5L, "Coca Cola", 12.23, 10);
		
		estoque.exibirProdutos();
		System.out.println("Valor total do estoque -> " + estoque.calcularValorTotalEstoque());
		System.out.println("Produto mais caro -> " + estoque.obterProdutoMaisCaro());
		System.out.println("Produto mais barato -> " + estoque.obterProdutoMaisBarato());
		System.out.println("Produto com maior valor em estoque -> " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

	}

}
