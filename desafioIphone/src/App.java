import iphone.IPhone;
import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class App {

	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		System.out.println("Testando Aparelho telefone no IPhone.");
		AparelhoTelefonico at = iphone;
		at.ligar();
		iphone.atender();
		at.iniciarCorreioVoz();
		
		System.out.println("Testando Navegador da internet no IPhone.");
		NavegadorInternet ni = iphone;
		ni.adicionarNovaAba();
		iphone.atualizarPagina();
		ni.exibirPagina();
		
		System.out.println("Testando Reprodutor Musical no IPhone.");
		ReprodutorMusical rm = iphone;
		rm.tocar();
		iphone.pausar();
		rm.selecionarMusica();

	}

}
