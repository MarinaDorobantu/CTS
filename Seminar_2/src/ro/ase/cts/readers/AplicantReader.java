package ro.ase.cts.readers;

import java.util.List;

import ro.ase.cts.classes.Aplicant;

public abstract class AplicantReader {
	
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	//metoda abstracta pe care celelate clase o vor implementa
	public abstract List<Aplicant> citesteAplicanti();
}
