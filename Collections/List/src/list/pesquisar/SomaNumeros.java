package list.pesquisar;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma=0;
		for (Integer i : numeros) {
			soma += i;
		}
		return soma;
	}
	
	
	public int encontrarMaiorNumero() {
		int maior = 0;
		for (Integer i : numeros) {
			if(i > maior) {
				maior=i;
			}
		}
		return maior;
	}
	
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		for (Integer i : numeros) {
			if(i < menor) {
				menor=i;
			}
		}
		return menor;
	}
	
	public void exibirNumeros() {
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
	}
	
	public static void main(String[] args) {
		SomaNumeros sn = new SomaNumeros();
		sn.adicionarNumero(10);
		sn.adicionarNumero(20);
		sn.adicionarNumero(30);
		sn.adicionarNumero(40);
		sn.adicionarNumero(50);
		sn.adicionarNumero(60);
		
		sn.exibirNumeros();
		System.out.println("Menor numero -> " + sn.encontrarMenorNumero());
		System.out.println("Maior numero -> " + sn.encontrarMaiorNumero());
		System.out.println("Soma dos numeros: " + sn.calcularSoma());
		
		
		
	}
}
