package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

	public static void main(String[] args) {
		// Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		int quant = numeros.stream().filter(n -> n > 10).toList().size();
		if(quant > 0) {
		  System.out.println("A lista possui " + quant + " numeros maior que 10.");
		} else{
		  System.out.println("A lista não possui numeros maiores que 10.");	
		}

	}

}
