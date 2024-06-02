package bancoDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		super();
		this.contas=new ArrayList<Conta>();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirContas() {
		this.contas.forEach(System.out::println);
	}
	
	public Conta criarConta(Cliente cliente, TipoConta tipo) {
		Conta conta;
		if(tipo == TipoConta.CONTA_CORRENTE) {
			 conta = new ContaCorrente(cliente);
		}else {
			conta = new ContaPoupanca(cliente);
		}
		
		this.contas.add(conta);
		return conta;
	}
	
	public Optional<Conta> getContaPeloNumero(int numero) {
		Optional<Conta> conta;
		List<Conta> contas = this.contas.stream().filter(c -> c.getNumero() == numero).toList();
		if(contas.size() > 0) {
			conta =Optional.of(contas.get(0));
		}else {
			conta=Optional.empty();
		}
		return conta;
	}
	
	

}
