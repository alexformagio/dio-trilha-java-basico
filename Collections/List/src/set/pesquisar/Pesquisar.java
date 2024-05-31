package set.pesquisar;

public class Pesquisar {

	public static void main(String[] args) {
		AgendaContatos ac = new AgendaContatos();
		ac.adicionarContato("Alexandre", 1111111111);
		ac.adicionarContato("Alexandre Machado", 1111111112);
		ac.adicionarContato("Thais", 222222222);
		ac.adicionarContato("Mariana", 33333333);
		ac.adicionarContato("Evelyn", 44444444);
		ac.adicionarContato("Amancia", 55555555);
		
		ac.exibirContatos();
		System.out.println("Buscar Contato Alexandre");
		for (Contato contato : ac.pesquisarPorNome("Alexandre")) {
			System.out.println(contato);
		}
		System.out.println("Alterar numero Amancia");
		ac.atualizarNumeroContato("Amancia", 66666666);
		ac.exibirContatos();

	}

}
