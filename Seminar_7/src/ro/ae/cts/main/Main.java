package ro.ae.cts.main;

import ro.ase.cts.adapter.AdapterCreditClasa;
import ro.ase.cts.adapter.AdapterCreditObiecte;
import ro.ase.cts.adapter.InterfataCredit;
import ro.ase.cts.adapter.Leasing;

public class Main {

	public static void oferaInformatiiCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing1=new Leasing();
		AdapterCreditObiecte adapterObiecte = new AdapterCreditObiecte(leasing1);
		//oferaInformatiiCredit(leasing1, "Ionel", 546.40f);
		oferaInformatiiCredit(adapterObiecte, "Ionel", 546.40f);	
		
		AdapterCreditClasa adapterClasa = new AdapterCreditClasa();
		oferaInformatiiCredit(adapterClasa, "Gigel", 324.50f);
		
	}

}
