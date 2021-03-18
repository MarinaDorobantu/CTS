package ro.ase.cts.main;

import ro.ase.cts.classes.ClinicaVeterinara;
import ro.ase.cts.classes.ClinicaVeterinaraLazy;
import ro.ase.cts.exercitiu.Administrator;

public class Program {

	public static void main(String[] args) {
//		
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
//		ClinicaVeterinaraLazy clinica1 = ClinicaVeterinaraLazy.getInstance("ClinicaVet", "Str.Dorobanti", 7, 4200.34F);
//		ClinicaVeterinaraLazy clinica2 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Str.Libertatii", 10, 5600.90F);
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
//		
//		clinica1.setNume("Clinica Noua");
//		clinica2.setNrMedici(13);
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		Administrator a1= Administrator.getInstance("Mihai", 2500, 1);
		Administrator a2=Administrator.getInstance("Adrian", 5000, 2);
		System.out.println(a1);
		System.out.println(a2);
	}

}
