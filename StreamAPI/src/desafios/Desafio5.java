package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

	public static void main(String[] args) {
		//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> numerosMaiorQue5 =numeros.stream().filter(n -> n > 5).toList();
		double media = numerosMaiorQue5.stream().reduce(0, Integer::sum) / numerosMaiorQue5.size();
		System.out.println("A Média dos numeros maor 5 é -> " + media);

	}

}
