package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtos;

	public CadastroProdutos() {
		super();
		this.produtos = new HashSet<Produto>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		this.produtos.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public void exibirSetOriginal() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

	public Set<Produto> exibirProdutosPorId() {
		Set<Produto> setPorID = new TreeSet<Produto>(produtos);
		return setPorID;
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> setPorNome = new TreeSet<Produto>(new ComparatorPorNome());
		setPorNome.addAll(produtos);
		return setPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> setPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		setPorPreco.addAll(produtos);
		return setPorPreco;
	}
	
	public Set<Produto> exibirProdutosPorQuantidade() {
		Set<Produto> setPorQuantidade = new TreeSet<Produto>(new ComparatorPorQuantidade());
		setPorQuantidade.addAll(produtos);
		System.out.println("Por quantidade size: " + setPorQuantidade.size());
		return setPorQuantidade;
	}

}
