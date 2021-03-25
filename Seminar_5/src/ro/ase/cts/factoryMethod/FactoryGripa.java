package ro.ase.cts.factoryMethod;

import ro.ase.cts.factoryMethod.Categorie;

public class FactoryGripa implements FactoryCategorie {

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		return new Gripa(pretDeBaza);
	}

	

}
