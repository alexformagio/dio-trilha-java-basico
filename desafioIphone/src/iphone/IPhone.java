package iphone;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando Musica ...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica ...");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica ...");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina da internet ...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador ...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina do navegador ...");
		
	}

	@Override
	public void ligar() {
		System.out.println("Realizando uma ligação ...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação ...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz ...");
	}

}
