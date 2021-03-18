package ro.ase.cts.eager;

public class ClinicaVeterinara {

	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	//La Eager Initialization, instanta statica este initializata la momentul declararii
	private static final ClinicaVeterinara clinicaVeterinara = new ClinicaVeterinara("Clinica Vet", "Str. Dorobanti",5,3000.2F);
	
	//Constructorul trebuie -obligatoriu- sa fie private!!!
	private ClinicaVeterinara(String nume, String adresa, int nrMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = nrMedici;
		this.buget = buget;
	}
	
	//Functia statica va returna instanta
	public static ClinicaVeterinara getInstance() {
		return clinicaVeterinara;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClinicaVeterinara [nume=");
		builder.append(nume);
		builder.append(", adresa=");
		builder.append(adresa);
		builder.append(", nrMedici=");
		builder.append(nrMedici);
		builder.append(", buget=");
		builder.append(buget);
		builder.append("]");
		return builder.toString();
	}
	
}
