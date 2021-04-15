package ro.ase.cts.composite.main;

import ro.ase.cts.composite.Item;
import ro.ase.cts.composite.OptiuniMeniu;
import ro.ase.cts.composite.Sectiune;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptiuniMeniu meniu = new Sectiune("Meniu restaurant");
				
		OptiuniMeniu sectiuneBauturi = new Sectiune("Bauturi");
		OptiuniMeniu sectiuneDesert = new Sectiune("Desert");
		
		OptiuniMeniu itemFrappe = new Item("Frappe");
		OptiuniMeniu itemApa = new Item("Apa plata");
		OptiuniMeniu itemProfiterol = new Item("Profiterol");
		
		try {
			sectiuneBauturi.adaugaNod(itemFrappe);
			sectiuneBauturi.adaugaNod(itemApa);
			sectiuneDesert.adaugaNod(itemProfiterol);			
			meniu.adaugaNod(sectiuneBauturi);
			meniu.adaugaNod(sectiuneDesert);
			
			meniu.descriere();			
			sectiuneBauturi.stergeNod(itemFrappe);
			sectiuneDesert.adaugaNod(itemFrappe);
			
			meniu.descriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}

}
