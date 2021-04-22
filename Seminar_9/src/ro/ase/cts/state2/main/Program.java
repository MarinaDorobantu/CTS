package ro.ase.cts.state2.main;

import ro.ase.cts.state2.Masa;

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
