package map.pesquisar;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
	private Map<Long, Produto> estoque;

	public EstoqueProduto() {
		super();
		this.estoque = new HashMap<Long, Produto>();
	}
	
	public void adicionarProduto(Long cod, String nome, Double preco, Integer quantidade) {
		estoque.put(cod, new Produto(cod, nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		for ( Produto p : estoque.values()) {
			System.out.println(p);
		}
	}
	
	public Double calcularValorTotalEstoque() {
		Double totaDouble = 0.0;
		for ( Produto p : estoque.values()) {
			totaDouble += p.getPreco() * p.getQuantidade();
		}
		return totaDouble;
	}
	
	
	public Produto obterProdutoMaisCaro() {
		Produto maisCaro = null;
		for ( Produto p : estoque.values()) {
			if(maisCaro == null) {
				maisCaro = p;
			}else {
				if(p.getPreco() > maisCaro.getPreco()) {
					maisCaro=p;
				}
			}
			
		}
		return maisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto maisBarato = null;
		for ( Produto p : estoque.values()) {
			if(maisBarato == null) {
				maisBarato = p;
			}else {
				if(p.getPreco() < maisBarato.getPreco()) {
					maisBarato=p;
				}
			}
			
		}
		return maisBarato;		
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto maisCaro = null;
		for ( Produto p : estoque.values()) {
			if(maisCaro == null) {
				maisCaro = p;
			}else {
				if(p.getValorXQuantidade() > maisCaro.getValorXQuantidade()) {
					maisCaro=p;
				}
			}
			
		}
		return maisCaro;	
	}//: Retorna o produto que está em maior quantidade no estoque,
	//considerando o valor total de cada produto (quantidade * preço).
	
	

}
