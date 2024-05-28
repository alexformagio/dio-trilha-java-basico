
import java.util.ArrayList;

class Livros extends ArrayList<Livro> {
   Livros() {
      this.add(new Livro("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
      this.add(new Livro("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java", "Raoul-Gabriel Urma e  Richard Warburton", 2021));
      this.add(new Livro("Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software", "Susan J. Fowler", 2017));
      this.add(new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos", "Aditya Y. Bhargava", 2017));
      this.add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
   }
}