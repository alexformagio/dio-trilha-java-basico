package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Item> carrinho = new ArrayList<Item>();

	public boolean adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		int i = carrinho.indexOf(item);
		if (i < 0) { // insere
			if (item.getPreco() <= 0.0) {
				System.out.println("Preço inválido. Preço informado: " + item.getPreco());
				return false;
			}
			if (item.getQuantidade() <= 0) {
				System.out.println("Quantidade inválida. Quantidade informada: " + item.getQuantidade());
				return false;
			}
			return carrinho.add(item);
		} else {
			if (item.getQuantidade() <= 0) {
				System.out.println("Quantidade inválida. Quantidade informada: " + item.getQuantidade());
				return false;
			}

			Item itemExistente = carrinho.get(i);
			carrinho.remove(i);
			itemExistente.setQuantidade(itemExistente.getQuantidade() + item.getQuantidade());
			return carrinho.add(itemExistente);
		}
	}
	
	public boolean removerItem(String nome) {
		Item item = new Item(nome, 0, 0);
		int i = carrinho.indexOf(item);
		if(i < 0) {
			System.out.println("Item não localizado no carrinho");
			return false;
		}else {
		  return carrinho.remove(item);
		}
	}
	
	public double calcularValorTotal() {
		double total = 0;
		for (Item item : carrinho) {
			double totalItem= item.getPreco() * item.getQuantidade();
			total += totalItem;
		}
		return total;
	}
	
	public void exibirItems() {
		for (Item item : carrinho) {
			System.out.println(item.toString());
		}
	}
}
