package ro.ase.cts.classes;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti();
	}
	
	public static void main(String[] args) {
		System.out.println(Student.getSumaFinantare());
		System.out.println(Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader=new StudentReader("studenti.txt");
		try {
			//linie modificari
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				System.out.println(angajat.getSumaFinantata());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
