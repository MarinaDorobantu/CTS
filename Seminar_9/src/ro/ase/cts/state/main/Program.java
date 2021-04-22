package ro.ase.cts.state.main;

import ro.ase.cts.state.Masa;
import ro.ase.cts.state.StareLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(12);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		//masa.setStareMasa(new StareLibera());
		masa.rezervaMasa();
		
		masa.ocupaMasa();
		masa.elibereazaMasa();
		
	}

}
