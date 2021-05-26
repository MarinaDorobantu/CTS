package ro.ase.cts.facade.classes;

public class Medic {
	
	private String numeMedic;
	private String specializare;
	
	public boolean esteNecesaraInternare(Pacient pacient) {
		return pacient.isEsteInStareGrava();
	}
	
	public Medic(String numeMedic, String specializare) {
		this.numeMedic=numeMedic;
		this.specializare=specializare;
	}
}
