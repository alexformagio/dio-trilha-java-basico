package set.ordenacao;

public class Ordenar {

	public static void main(String[] args) {
		CadastroProdutos cadProduto = new CadastroProdutos();
		cadProduto.adicionarProduto(3, "Lata Atum", 8.80, 3);
		cadProduto.adicionarProduto(1, "Lata milho", 5.20, 2);
		cadProduto.adicionarProduto(4, "Leite", 5.80, 1);
		cadProduto.adicionarProduto(2, "Pao de forma", 11.0, 4);
		cadProduto.adicionarProduto(5, "Chocolate Talento", 9.70, 5);
		
		System.out.println("Set Original");
		cadProduto.exibirSetOriginal();
		
		System.out.println("Set por Id");
		for (Produto p : cadProduto.exibirProdutosPorId()) {
			System.out.println(p);
		}
		
		System.out.println("Set por Nome");
		for (Produto p : cadProduto.exibirProdutosPorNome()) {
			System.out.println(p);
		}
		
		System.out.println("Set por Preço");
		for (Produto p : cadProduto.exibirProdutosPorPreco()) {
			System.out.println(p);
		}
		
		System.out.println("Set por Quantidade");
		for (Produto p : cadProduto.exibirProdutosPorQuantidade()) {
			System.out.println(p);
		}

	}

}
