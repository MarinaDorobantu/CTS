package ro.ase.cts.main;


import ro.ase.cts.classes.Categorie;
import ro.ase.cts.classes.CategorieFactory;
import ro.ase.cts.classes.CategoriiMedicamente;

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
