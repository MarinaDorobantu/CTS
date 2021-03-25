package ro.ase.cts.simpleFactory.main;


import ro.ase.cts.simpleFactory.Categorie;
import ro.ase.cts.simpleFactory.CategorieFactory;
import ro.ase.cts.simpleFactory.CategoriiMedicamente;

public class Main {

	public static CategoriiMedicamente getTipCategorie() {
		
		return CategoriiMedicamente.body;
	}
	
	public static void main(String[] args) {
		
		try {
			CategorieFactory categorieFactory = new CategorieFactory();
			Categorie durere = categorieFactory.creareCategorie(CategoriiMedicamente.durere, 12);
			Categorie body = categorieFactory.creareCategorie(CategoriiMedicamente.body, 10);
			Categorie categorie = categorieFactory.creareCategorie(getTipCategorie(), 15);
			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
