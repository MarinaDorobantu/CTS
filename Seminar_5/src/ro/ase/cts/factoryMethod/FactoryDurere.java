package ro.ase.cts.factoryMethod;

import ro.ase.cts.factoryMethod.Categorie;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Durere(pretDeBaza);
	}

	

}
