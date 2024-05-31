package list.ordenacao;

import java.util.Comparator;

public class ComparePorIdade implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getIdade().compareTo(o2.getIdade());
	}

}
