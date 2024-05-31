package list.pesquisar;

public class Pesquisar {

	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Micro", "autor1", 2015);
		
		System.out.println("#########  Pesquisa por Autor   ##########");
		for (Livro livro : catalogoLivros.getAll()) {
			System.out.println(livro);
		}

		System.out.println("#########  Pesquisa por Autor   ##########");
		for (Livro livro : catalogoLivros.pesquisarPorAutor("peter")) {
            System.out.println(livro);
		}

		System.out.println("#########  Pesquisa por Ano   ##########");
		for (Livro livro : catalogoLivros.pesquisarPorIntervaloAnos(2019, 2024)) {
			System.out.println(livro);
		}

		System.out.println("#########  Pesquisa por Titulo   ##########");
		Livro l = catalogoLivros.pesquisarPorTitulo("Micro");
		if(l == null) {
			System.out.println("Livro não localizado");
		}else {	
			System.out.println(l);
		}
		

	}

}
