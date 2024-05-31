package set.pesquisar;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatos;

public AgendaContatos() {
	super();
	this.contatos = new HashSet<Contato>();
}

public void adicionarContato(String nome, int numero) {
	contatos.add(new Contato(nome, numero));
}

public void exibirContatos() {
	for (Contato contato : contatos) {
		System.out.println(contato);
	}
}

public Set<Contato> pesquisarPorNome(String nome){
   Set<Contato> lista = new HashSet<Contato>();
   for (Contato contato : contatos) {
	if(contato.getNome().startsWith(nome)) {
		lista.add(contato);
	}
   }
   return lista;
}

public void atualizarNumeroContato(String nome, int novoNumero) {
	for (Contato contato : contatos) {
		if(contato.getNome().equalsIgnoreCase(nome)) {
			//this.contatos.remove(contato);
			contato.setNumero(novoNumero);
			//contatos.add(contato);
			break;
		}
	}
	
}
  
  
}
