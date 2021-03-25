package ro.ase.cts.factoryMethod.main;

import ro.ase.cts.factoryMethod.Categorie;
import ro.ase.cts.factoryMethod.FactoryBody;
import ro.ase.cts.factoryMethod.FactoryCategorie;

public class Main {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryBody();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie=factoryCategorie.creareCategorie(14);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 10);
	}

}
