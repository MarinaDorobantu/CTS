package ro.ase.cts.state;

public class Masa {
	private Stare stareMasa;
	private int numar;
	
	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stareMasa = new StareLibera();
	}

	public Stare getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(Stare stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}
	
	public void rezervaMasa() {
//		Stare stareRezervata = new StareRezervata();
//		stareRezervata.modificaStare(this);
		modificaStareMasa(new StareRezervata());
	}
	
	public void elibereazaMasa() {
		Stare stareLibera = new StareLibera();
		stareLibera.modificaStare(this);
	}
	
	public void ocupaMasa() {
		Stare stareOcupata = new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	
	public void modificaStareMasa(Stare stare) {
		stare.modificaStare(this);
	}
}
