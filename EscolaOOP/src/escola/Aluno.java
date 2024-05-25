package escola;

public class Aluno {
	
	private String nome;
	private int idade;
	private UF uf;

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Aluno(String nome, int idade, UF estado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.uf = estado;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	

}
