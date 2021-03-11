package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;

public abstract class AplicantReader {
	
	private String fisier;
	
	//metoda abstracta pe care celelate clase o vor implementa
	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException;

	public AplicantReader(String fisier) {
		super();
		this.fisier = fisier;
	}

	public String getFisier() {
		return fisier;
	}
	
	public void citesteAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNr_proiecte(nr,vect);
	}
	
}
