package ro.ase.cts.strategy;

public class Cash implements ModPlata {

	
	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("Se plateste suma cash suma de "+sumaPlatita+" RON");
	}
	
}
