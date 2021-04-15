package ro.ase.cts.classes.composite;

public interface OptiuniMeniu {
	void adaugaNod(OptiuniMeniu optiune) throws Exception;
	void stergeNod(OptiuniMeniu optiune);
	OptiuniMeniu getNod(int index);
	void descriere();
}
