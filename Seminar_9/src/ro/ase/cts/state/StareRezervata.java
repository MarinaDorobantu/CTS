package ro.ase.cts.state;

public class StareRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera) {
			System.out.println("Ati rezervat masa cu numarul "+masa.getNumar());
			masa.setStareMasa(this);
		}
		else {
			System.out.println("Masa nu este disponibila");
		}
	}

}
