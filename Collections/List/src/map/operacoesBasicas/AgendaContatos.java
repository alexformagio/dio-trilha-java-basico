package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatos;

	public AgendaContatos() {
		super();
		this.agendaContatos = new HashMap<String, Integer>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		this.agendaContatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if (this.agendaContatos.containsKey(nome)) {
			this.agendaContatos.remove(nome);
		}else {
			System.out.println("Chave não localizada");
		}
	}
	
	public void exibirContatos() {
	  for (Map.Entry<String, Integer> entry : agendaContatos.entrySet()) {
		String nome = entry.getKey();
		Integer tel = entry.getValue();
		System.out.println("Nome: " + nome + ", Telefone: " + tel);
		
	}	
	}
	
	public Integer pesquisarPorNome(String nome) {
		return this.agendaContatos.get(nome);
	}
	
	

}
