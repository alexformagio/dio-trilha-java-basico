package map.operacoesBasicas;

public class OperacoesBasicas {

	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		agenda.adicionarContato("Alexandre", 1111111111);
		agenda.adicionarContato("Alexandre", 1111111112);
		agenda.adicionarContato("Thais", 222222222);
		agenda.adicionarContato("Mariana", 33333333);
		agenda.adicionarContato("Evelyn", 44444444);
		agenda.adicionarContato("Amancia", 55555555);
		
		agenda.exibirContatos();
		System.out.println("Pesquisar por nome Evelyn, telefone: " + agenda.pesquisarPorNome("Evelyn"));
		System.out.println("Remover Amancia");
		agenda.removerContato("Amancia");
		System.out.println("Lista após remover Amancia");
		agenda.exibirContatos();

	}

}
