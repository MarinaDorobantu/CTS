package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

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
	
	
}
