package list.OperacoesBasicas;
public class CarrinhoMain {

	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.adicionarItem("Atum", 8.50, 1);
		carrinho.adicionarItem("atum", 0, 2);
		carrinho.adicionarItem("milho", 3.20, 2);
		carrinho.adicionarItem("Leite", 5.20, 2);
		carrinho.exibirItems();
		if (carrinho.removerItem("Milho")) {
			System.out.println("Milho removido");
		}
		carrinho.exibirItems();
		double total = carrinho.calcularValorTotal();
		System.out.println("Total a pagar: " + total);

	}

}
