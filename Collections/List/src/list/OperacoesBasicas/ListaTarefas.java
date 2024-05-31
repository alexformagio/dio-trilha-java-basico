package list.OperacoesBasicas;

import java.util.ArrayList;

public class ListaTarefas {

	private ArrayList<Tarefa> lista = new ArrayList<Tarefa>();
	
	public boolean adicionarTarefa(String tarefa) {
		int i = lista.indexOf(new Tarefa(tarefa));
		if( i >= 0) {
			System.out.println("Tarefa já cadastrada!");
			return false;
		}
		return lista.add(new Tarefa(tarefa));
	}
	
	public boolean removerTarefa(String tarefa) {
		int i = lista.indexOf(new Tarefa(tarefa));
		if( i < 0) {
			System.out.println("Tarefa não Localizada!");
			return false;
		}
		Tarefa t = lista.get(i);
		return lista.remove(t);
	}
	
	public int obterNumeroTotalTarefas() {
		return lista.size();
	}
	
	public ArrayList<Tarefa> obterDescricoesTarefas(){
		return lista;
	}
}
