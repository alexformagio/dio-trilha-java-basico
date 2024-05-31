package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(new Pessoa("Thais", 1.74, 42));
		listaPessoas.add(new Pessoa("Alexandre", 1.72, 46));
		listaPessoas.add(new Pessoa("Mariana", 1.68, 19));
		listaPessoas.add(new Pessoa("Evelyn", 1.70, 17));
		listaPessoas.add(new Pessoa("Ana Valeria", 1.72, 32));
		listaPessoas.add(new Pessoa("Amancia", 1.60, 73));
		
		System.out.println(listaPessoas);
		Collections.sort(listaPessoas);
		System.out.println(listaPessoas);
		Collections.sort(listaPessoas, new ComparePorIdade());
		System.out.println(listaPessoas);
		Collections.sort(listaPessoas, new ComparePorAltura());
		System.out.println(listaPessoas);
		

	}

}
