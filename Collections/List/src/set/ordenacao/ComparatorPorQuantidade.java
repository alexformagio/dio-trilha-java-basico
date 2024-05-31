package set.ordenacao;

import java.util.Comparator;

public class ComparatorPorQuantidade implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		// TODO Auto-generated method stub
		return o1.getQuantidade().compareTo(o2.getQuantidade());
	}

}
