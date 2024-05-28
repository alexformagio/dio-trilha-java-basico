import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import Main.1;

public class Main {
   public static void main(String[] args) {
      System.out.println("---------------------------------------");
      ArrayList<Livro> livros = new Livros();
      
      
      System.out.println("Livros após a ordenação natural (Título): ");
      Collections.sort(livros);
      Iterator var2 = livros.iterator();

      PrintStream var10000;
      String var10001;
      Livro livro;
      while(var2.hasNext()) {
         livro = (Livro)var2.next();
         var10000 = System.out;
         var10001 = livro.getTitulo();
         var10000.println(var10001 + " - " + livro.getAutor() + " - " + livro.getAno());
      }

      System.out.println("---------------------------------------");
      System.out.println("Livros após a ordenação por ano: ");
      Collections.sort(livros, new CompararAno());
      var2 = livros.iterator();

      int var4;
      while(var2.hasNext()) {
         livro = (Livro)var2.next();
         var10000 = System.out;
         var4 = livro.getAno();
         var10000.println(var4 + " - " + livro.getTitulo() + " - " + livro.getAutor());
      }

      System.out.println("---------------------------------------");
      System.out.println("Livros após a ordenação por autor: ");
      Collections.sort(livros, new CompararAutor());
      var2 = livros.iterator();

      while(var2.hasNext()) {
         livro = (Livro)var2.next();
         var10000 = System.out;
         var10001 = livro.getAutor();
         var10000.println(var10001 + " - " + livro.getTitulo() + " - " + livro.getAno());
      }

      System.out.println("---------------------------------------");
      System.out.println("Livros após a ordenação por ano, autor e título: ");
      Collections.sort(livros, new CompararAnoAutorTitulo());
      var2 = livros.iterator();

      while(var2.hasNext()) {
         livro = (Livro)var2.next();
         var10000 = System.out;
         var4 = livro.getAno();
         var10000.println(var4 + " - " + livro.getAutor() + " - " + livro.getTitulo());
      }

   }
}