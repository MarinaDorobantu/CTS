package ro.ase.cts.command.main;

import ro.ase.cts.command.classes.ComandaConstruire;
import ro.ase.cts.command.classes.ComandaDepunere;
import ro.ase.cts.command.classes.ComandaRetragere;
import ro.ase.cts.command.classes.ContBancar;
import ro.ase.cts.command.classes.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		
		ManagerComenzi managerComenzi = new ManagerComenzi();
		managerComenzi.invoca(new ComandaConstruire(new ContBancar("Marina"), 500));
		managerComenzi.invoca(new ComandaRetragere(new ContBancar("Andreea"), 200));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaDepunere(new ContBancar("Cosmina"), 100));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
