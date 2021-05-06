package ro.ase.cts.command.classes;

public class ContBancar {
	
	private String detinator;
	private float suma;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.suma = 0;
	}
	
	public void construire(float sumaConstruire) {
		System.out.println("Contul a fost construit");
		this.suma=sumaConstruire;
	}
	
	public void retragere(float sumaRetrasa) {
		if(this.suma>=sumaRetrasa) {
			System.out.println("S-a efectuat retragere");
			this.suma-=sumaRetrasa;
		}else {
			System.out.println("Nu dispuneti de fonduri suficiente");
		}
	}
	
	public void depunere(float sumaDepusa) {
		this.suma+=sumaDepusa;
		System.out.println("Sa depus suma");
	}
}
