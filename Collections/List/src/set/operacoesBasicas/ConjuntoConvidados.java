package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		super();
		this.convidados = new HashSet<Convidado>();
	}
	
	public void adicionarConvidados(String nome, int codigoConvite) {
		this.convidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
	   for (Convidado convidado : convidados) {
		  if(convidado.getCodigoConvite().equals(codigoConvite)) {
			  this.convidados.remove(convidado);
			  break;
		  }
	   }	
	}
	
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	
	public void exibirConvidados() {
		for (Convidado convidado : convidados) {
			System.out.println(convidado);
		}
	}
	
	
}
