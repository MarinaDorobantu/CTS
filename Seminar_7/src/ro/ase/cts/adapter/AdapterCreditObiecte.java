package ro.ase.cts.adapter;

public class AdapterCreditObiecte implements InterfataCredit {
	private Leasing leasing;

	public AdapterCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		leasing.oferaLeasing(numeClient, suma);	
	}
	
	
}
