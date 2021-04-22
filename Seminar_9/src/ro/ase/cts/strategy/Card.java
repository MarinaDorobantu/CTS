package ro.ase.cts.strategy;

public class Card implements ModPlata {

	private double sold;
	
	public Card(double sold) {
		super();
		this.sold = sold;
	}

	@Override
	public void plateste(double sumaPlatita) {
		// TODO Auto-generated method stub
		if(sold>=sumaPlatita) {
			System.out.println("Se plateste cu cardul suma de "+sumaPlatita+ " RON");
			sold-=sumaPlatita;
		}else {
			System.out.println("Fonduri insuficiente");
		}
		
	}
}
