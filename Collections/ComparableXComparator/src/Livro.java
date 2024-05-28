
class Livro implements Comparable<Livro> {
   private String titulo;
   private String autor;
   private int ano;

   public Livro(String ti, String au, int an) {
      this.titulo = ti;
      this.autor = au;
      this.ano = an;
   }

   public int compareTo(Livro l) {
      return this.titulo.compareTo(l.titulo);
   }

   public String getTitulo() {
      return this.titulo;
   }

   public String getAutor() {
      return this.autor;
   }

   public int getAno() {
      return this.ano;
   }
}
    