package ro.ase.cts.classes.proxy.main;

import ro.ase.cts.classes.proxy.IRezervare;
import ro.ase.cts.classes.proxy.ProxyRezervare;
import ro.ase.cts.classes.proxy.Rezervare;

public class Program {

	public static void main(String[] args) {
		IRezervare rezervarePentruDouaPersoane = new Rezervare(3, 2);
		rezervarePentruDouaPersoane.anuntaRezervare();
		
		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervarePentruDouaPersoane);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();

	}

}
