package ro.ase.cts.prototype.classes;

public class Client implements AbstractPrototype {
	
	private int codCLient;
	private String nume;
	private int varsta;
	
	//validare varsta
	public Client(int codCLient, String nume, int varsta) {
		super();
		this.codCLient = codCLient;
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private Client() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [codCLient=");
		builder.append(codCLient);
		builder.append(", nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		Client client = new Client();
		client.codCLient = this.codCLient;
		client.nume=this.nume;
		client.varsta=this.varsta;
		
		return client;
	} 
	
	
}
