package ro.ase.cts.flyweight;

public class Client implements AbstractFlyweight{
	
	private String nume;
	private String nrTelefon;
	private String adresaEmail;
	
	public Client(String nume, String nrTelefon, String adresaEmail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", adresaEmail=");
		builder.append(adresaEmail);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void afisareInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+ rezervare.toString());
	}
	
	
	
}
