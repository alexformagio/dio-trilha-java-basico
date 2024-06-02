package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {

	public static void main(String[] args) {
		// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println("O segundo maior numero da lista é " +
		                    numeros.stream().sorted((n1,n2) -> n2.compareTo(n1)).toList().get(1)
		);

	}

}
