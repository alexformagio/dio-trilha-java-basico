package set.ordenacao;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getPreco().compareTo(o2.getPreco());
	}

}
