package ro.ase.cts.main;

import ro.ase.cts.classes.composite.Item;
import ro.ase.cts.classes.composite.OptiuniMeniu;
import ro.ase.cts.classes.composite.Sectiune;
import ro.ase.cts.classes.proxy.IRezervare;
import ro.ase.cts.classes.proxy.ProxyRezervare;
import ro.ase.cts.classes.proxy.Rezervare;

public class Program {

	public static void main(String[] args) {
		
//		OptiuniMeniu meniu = new Sectiune("Meniu restaurant");
//		
//		OptiuniMeniu sectiuneBauturi = new Sectiune("Bauturi");
//		OptiuniMeniu sectiuneDesert = new Sectiune("Desert");
//		
//		OptiuniMeniu itemFrappe = new Item("Frappe");
//		OptiuniMeniu itemApa = new Item("Apa plata");
//		OptiuniMeniu itemProfiterol = new Item("Profiterol");
//		
//		try {
//			sectiuneBauturi.adaugaNod(itemFrappe);
//			sectiuneBauturi.adaugaNod(itemApa);
//			sectiuneDesert.adaugaNod(itemProfiterol);
//			
//			meniu.adaugaNod(sectiuneBauturi);
//			meniu.adaugaNod(sectiuneDesert);
//			
//			meniu.descriere();
//			
//			sectiuneBauturi.stergeNod(itemFrappe);
//			sectiuneDesert.adaugaNod(itemFrappe);
//			
//			meniu.descriere();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		IRezervare rezervarePentruDouaPersoane = new Rezervare(3, 2);
		rezervarePentruDouaPersoane.anuntaRezervare();
		
		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervarePentruDouaPersoane);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();
		
	}
	
	

}
