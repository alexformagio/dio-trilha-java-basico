import device.copiadora.Copiadora;
import device.copiadora.CopiadoraXerox;
import device.digitalizadora.Digitalizadora;
import device.digitalizadora.ScannerEpson;
import device.digitalizadora.ScannerSamsung;
import device.impressoras.DeskJet;
import device.impressoras.Impressora;
import device.impressoras.LaserJet;
import device.mult_funcional.Mutifuncional;

public class Loja {

	public static void main(String[] args) {
		Impressora deskjet = new DeskJet();
		Impressora laserjet = new LaserJet();
		Mutifuncional  multi = new Mutifuncional();
		Impressora multiImp = multi;
		deskjet.imprimir();
		laserjet.imprimir();
		multiImp.imprimir();
		
		Copiadora xerox = new CopiadoraXerox();
		Copiadora multx = multi;
		
		xerox.copiar();
		multx.copiar();
		
		Digitalizadora epson = new ScannerEpson();
		Digitalizadora samsung = new ScannerSamsung();
		Digitalizadora multiS = multi;
		
		epson.digitalizar();
		samsung.digitalizar();
		multiS.digitalizar();
		

	}

}
