package binaryOperator;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample3 {
	  public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	    // Usar o BinaryOperator para somar todos os números no Stream
	    int resultado = numeros.stream()
	        .reduce(0, (n1 , n2) -> n1 + n2);

	    // Imprimir o resultado da soma
	    System.out.println("A soma dos números é: " + resultado);
	    
	    // Usar o BinaryOperator para somar todos os números no Stream com sum
	    resultado = numeros.stream()
	        .reduce(10, Integer::sum);

	    // Imprimir o resultado da soma
	    System.out.println("A soma dos números começando com 10 com sum() é: " + resultado);


	  }
	}