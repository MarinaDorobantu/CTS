package ro.ase.cts.state;

public class StareOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareOcupata)) {
			System.out.println("Masa cu numarul "+masa.getNumar()+" poate fi ocupata");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa cu numarul "+masa.getNumar()+" este deja ocupata");
		}
		
	}
	

}
