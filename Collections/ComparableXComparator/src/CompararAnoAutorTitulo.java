import java.util.Comparator;

class CompararAnoAutorTitulo implements Comparator<Livro> {
   public int compare(Livro l1, Livro l2) {
      int ano = Integer.compare(l1.getAno(), l2.getAno());
      if (ano != 0) {
         return ano;
      } else {
         int autor = l1.getAutor().compareTo(l2.getAutor());
         return autor != 0 ? autor : l1.getTitulo().compareTo(l2.getTitulo());
      }
   }
}