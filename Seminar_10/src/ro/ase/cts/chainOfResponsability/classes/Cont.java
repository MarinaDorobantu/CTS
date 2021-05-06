package ro.ase.cts.chainOfResponsability.classes;

public abstract class Cont {
	private float sold;
	private String numeClient;
	private Cont succesor;
	
	public Cont(float sold, String numeClient, Cont succesor) {
		super();
		this.sold = sold;
		this.numeClient = numeClient;
		this.succesor = succesor;
	}

	public Cont getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Cont succesor) {
		this.succesor = succesor;
	}

	public float getSold() {
		return sold;
	}

	public String getNumeClient() {
		return numeClient;
	}
	
	public abstract void plateste(float suma);
}
