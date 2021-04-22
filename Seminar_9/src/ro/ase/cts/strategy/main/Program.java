package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.Card;
import ro.ase.cts.strategy.Cash;
import ro.ase.cts.strategy.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Dorobantu");
		client.setModPlata(new Cash());
		client.plateste(150);
		
		client.setModPlata(new Card(500));
		client.plateste(350);
		client.plateste(200);
	}

}
