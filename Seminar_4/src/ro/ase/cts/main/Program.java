package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.eager.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
//		
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ClinicaVeterinaraLazy clinica1 = ClinicaVeterinaraLazy.getInstance("ClinicaVet", "Str.Dorobanti", 7, 4200.34F);
		ClinicaVeterinaraLazy clinica2 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Str.Libertatii", 10, 5600.90F);
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
	}

}
