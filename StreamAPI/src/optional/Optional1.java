package optional;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		Optional<String> optionalValue = Optional.of("Hello");
		System.out.println("Testando optionalValue.get() -> " + optionalValue.get());
		
		String nullableValue = null;
		optionalValue = Optional.ofNullable(nullableValue);
		System.out.println("Testando optionalValue.isPresent() -> " + optionalValue.isPresent());
		
		optionalValue = Optional.empty();
		System.out.println("Testando Optional.empty() -> " + optionalValue.isPresent());
		
		optionalValue = Optional.of("Hello");
		System.out.println("isPresent(): Verifica se o Optional contém um valor não nulo. -> " + optionalValue.isPresent());
		
		optionalValue = Optional.ofNullable(null);
		System.out.println("Verifica se o Optional está vazio -> " + optionalValue.isEmpty());
		
		optionalValue = Optional.of("Hello");
		System.out.println("optionalValue.get() -> " + optionalValue.get());
		
		optionalValue = Optional.ofNullable(null);
		String result = optionalValue.orElse("Default"); 
		System.out.println("Testando valor default com optionalValue.orElse -> " + result);
		
		optionalValue = Optional.ofNullable(null);
		result = optionalValue.orElseGet(() -> "Value from Supplier");
		System.out.println("optionalValue.orElseGet -> " + result);
		
		optionalValue = Optional.of("Hello");
		optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
		
		optionalValue = Optional.ofNullable(null);
		System.out.println("Testando lançamento de exception com orElseThrow");
		result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));

	}

}
