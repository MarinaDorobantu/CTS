package ro.ase.cts.classes.composite;

public class Item implements OptiuniMeniu{

	private String numeItem;
	
	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugaNod(OptiuniMeniu optiune) throws Exception {
		throw new Exception("NU este implementata");
	}

	@Override
	public void stergeNod(OptiuniMeniu optiune) {
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public OptiuniMeniu getNod(int index) {
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public void descriere() {
		System.out.println("     Item: "+numeItem);
		
	}
	
}
