import java.util.Comparator;

class CompararAno implements Comparator<Livro> {
   public int compare(Livro l1, Livro l2) {
      return Integer.compare(l1.getAno(), l2.getAno());
   }
}