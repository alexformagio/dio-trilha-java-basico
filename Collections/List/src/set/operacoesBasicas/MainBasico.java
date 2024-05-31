package set.operacoesBasicas;

public class MainBasico {

	public static void main(String[] args) {
		ConjuntoConvidados conjunto = new ConjuntoConvidados();
		conjunto.adicionarConvidados("Alexandre", 1);
		conjunto.adicionarConvidados("Alex", 1);
		conjunto.adicionarConvidados("Thais", 2);
		conjunto.adicionarConvidados("Mariana", 3);
		conjunto.adicionarConvidados("Evelyn", 4);
		conjunto.adicionarConvidados("Amancia", 5);
		conjunto.adicionarConvidados("Léia", 6);
		
		conjunto.exibirConvidados();
		System.out.println("Total de Convidados -> " + conjunto.contarConvidados());
		conjunto.removerConvidadoPorCodigoConvite(6);
		System.out.println("Total de Convidados após exclusão-> " + conjunto.contarConvidados());
		conjunto.exibirConvidados();

	}

}
