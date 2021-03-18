package ro.ase.cts.exercitiu;

public class Administrator {
	
	private String nume;
	private float salariu;
	private int nrScara;
	
	private static Administrator instanta = null;
	
	private Administrator(String nume, float salariu, int nrScara) {
		super();
		this.nume = nume;
		this.salariu = salariu;
		this.nrScara = nrScara;
	}
	
	public static synchronized Administrator getInstance(String nume, float salariu, int nrScara) {
		if(instanta == null) {
			instanta = new Administrator(nume, salariu, nrScara);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrator [nume=");
		builder.append(nume);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append(", nrScara=");
		builder.append(nrScara);
		builder.append("]");
		return builder.toString();
	}
	
	
}
