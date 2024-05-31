package list.ordenacao;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private Double altura;
	private Integer idade;
	
	public Pessoa(String nome, Double altura, Integer idade) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(altura, other.altura) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", altura=" + altura + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.getNome().compareTo(o.getNome());
	}
	
	
	
	

}
