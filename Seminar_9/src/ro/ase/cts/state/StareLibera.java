package ro.ase.cts.state;

public class StareLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera)) {
			System.out.println("Masa cu codul "+masa.getNumar()+" a fost eliberata");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa este deja libera");
		}
		
	}

}
