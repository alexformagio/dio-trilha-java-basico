package list.OperacoesBasicas;
public class Main {

	public static void main(String[] args) {
		ListaTarefas lista = new ListaTarefas();
		lista.adicionarTarefa("Praticar meditação");
		lista.adicionarTarefa("Ler um livro");
		lista.adicionarTarefa("Ler um livro");
		lista.adicionarTarefa("Conferir situação dos sistemas");
		lista.adicionarTarefa("Desenvolver nova feature no sistema");
		lista.adicionarTarefa("Reunião com equipe de vendas");
		lista.adicionarTarefa("Happy hour com equipe");

		System.out.println("Total de tarefas antes de remoção -> " + lista.obterNumeroTotalTarefas());
		lista.removerTarefa("Happy hour com equipe");
		System.out.println("Total de tarefas após remoção-> " + lista.obterNumeroTotalTarefas());
		
		for (Tarefa t : lista.obterDescricoesTarefas()) {
			System.out.println(t.getDescricao());
		}
	}

}
