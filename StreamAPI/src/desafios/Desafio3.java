package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).toList();
		if(numerosNegativos.size() == 0) {
			System.out.println("Todos os numeros da lista são positivos");
		}else {
			System.out.println("Possuimos " + numerosNegativos.size() + " numeros negativos");
		}
		
		numeros = Arrays.asList(-10, -8, -5,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		numerosNegativos = numeros.stream().filter(n -> n < 0).toList();
		if(numerosNegativos.size() == 0) {
			System.out.println("Todos os numeros da lista são positivos");
		}else {
			System.out.println("Possuimos " + numerosNegativos.size() + " numeros negativos");
		}

	}

}
