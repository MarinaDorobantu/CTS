package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements OptiuniMeniu{
	
	private List<OptiuniMeniu> listaSectiuni;
	private String numeSectiune;
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		listaSectiuni = new ArrayList<>();
	}
	@Override
	public void adaugaNod(OptiuniMeniu optiune) {
		listaSectiuni.add(optiune);
		
	}
	@Override
	public void stergeNod(OptiuniMeniu optiune) {
		listaSectiuni.remove(optiune);
		
	}
	@Override
	public OptiuniMeniu getNod(int index) {
		return listaSectiuni.get(index);
	}
	@Override
	public void descriere() {
		System.out.println("Sectiune: "+numeSectiune);
		for(OptiuniMeniu optiune:listaSectiuni) {
				optiune.descriere();
		}
		
	}
	
	
}
