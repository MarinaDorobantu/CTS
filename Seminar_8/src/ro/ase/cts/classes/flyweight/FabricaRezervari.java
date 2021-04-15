package ro.ase.cts.classes.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {

	private Map<String,AbstractFlyweight> clienti;
	
	public FabricaRezervari() {
		super();
		clienti = new HashMap<String, AbstractFlyweight>();
	}
	
	public AbstractFlyweight getClient(String email) {
		AbstractFlyweight client = clienti.get(email);
		if(client == null) {
			client = new Client("Marina","0722398456",email);
			clienti.put(email, client);
		}
		return client;
		
	}
	
}
