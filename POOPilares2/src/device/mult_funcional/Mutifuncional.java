package device.mult_funcional;

import device.copiadora.Copiadora;
import device.digitalizadora.Digitalizadora;
import device.impressoras.Impressora;

public class Mutifuncional implements Impressora, Copiadora, Digitalizadora{

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando com multifuncional");
		
	}

	@Override
	public void copiar() {
		System.out.println("Copiando com multifuncional");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo com multifuncional");
		
	}

}
