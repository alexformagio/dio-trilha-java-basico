package main;

import bancoDigital.Banco;
import bancoDigital.Cliente;
import bancoDigital.Conta;
import bancoDigital.TipoConta;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("DIO Bank");
		banco.criarConta(new Cliente("Evelyn Formagio"), TipoConta.CONTA_CORRENTE);
		banco.criarConta(new Cliente("Mariana Formagio"), TipoConta.CONTA_POUPANCA);
		Conta cc = banco.criarConta(new Cliente("Alexandre Formagio"), TipoConta.CONTA_CORRENTE);
		Conta poupanca = banco.criarConta(new Cliente("Thais Lopes Formagio"), TipoConta.CONTA_POUPANCA);
		cc.depositar(200);
		cc.transferir(50, poupanca);
		
		cc.visualizarExtrato();
		poupanca.visualizarExtrato();
		banco.exibirContas();
		
	   Conta conta1 = banco.getContaPeloNumero(1).orElseThrow(() -> new RuntimeException("Conta não Localizada"));
	   conta1.depositar(120);
	   conta1.visualizarExtrato();
	   banco.exibirContas();
		
	   Conta conta10 = banco.getContaPeloNumero(10).orElseThrow(() -> new RuntimeException("Conta não Localizada"));

	}

}
