package list.pesquisar;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livros = new Livros();

	public boolean adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		return livros.add(livro);
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> lista = new ArrayList<Livro>();
		for (Livro livro : livros) {
			if (livro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
				lista.add(livro);
			}
		}
		return lista;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> lista = new ArrayList<Livro>();
		for (Livro livro : livros) {
			if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
				lista.add(livro);
			}
		}
		return lista;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroAchado = null;
		for (Livro livro : livros) {
			if(livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
				livroAchado = livro;
				break;
			}	
		}	
		return livroAchado;		
	}
	
	public List<Livro> getAll() {
		return livros;
	}

}
