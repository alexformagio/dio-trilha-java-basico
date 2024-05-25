package escola;

public class Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alexandre Formagio");
		aluno.setIdade(47);
		aluno.setUf(UF.SAO_PAULO);
		
		Aluno mariana = new Aluno("Mariana Lopes Formagio", 19, UF.RIO_JANEIRO);
		
		System.out.println("Aluno - Nome: " + aluno.getNome() + ", idade: " + aluno.getIdade() + ", estado: " + aluno.getUf().getSigla());
		System.out.println("Aluno - Nome: " + mariana.getNome() + ", idade: " + mariana.getIdade() + ", estado:" + mariana.getUf().getNome());
	}

}
