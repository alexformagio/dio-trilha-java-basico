package list.pesquisar;

import java.util.Objects;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Livro(String titulo, String autor, int ano) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(titulo.toLowerCase(), other.titulo.toLowerCase());
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
	}
	
	
	
	

}
