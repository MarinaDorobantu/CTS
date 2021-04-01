package ro.ase.cts.builder1.classes;

public class Builder implements IBuilder{
	
	private Rezervare rezervare;
	public Builder() {
		rezervare = new Rezervare(false,false,false,false,"gen",1);
	}
	public Builder(int codRezervare) {
		rezervare = new Rezervare(false,false,false,false,"gen",codRezervare);
	}
	
	public Builder setMancareInclusa(boolean mancareInclusa) {
		this.rezervare.setMancareInclusa(mancareInclusa); 
		return this;
	}

	public Builder setScaunErgonmic(boolean scaunErgonmic) {
		this.rezervare.setScaunErgonmic(scaunErgonmic); 
		return this;
	}

	public Builder setBauturaRacoritaore(boolean bauturaRacoritaore) {
		this.rezervare.setBauturaRacoritaore(bauturaRacoritaore); 
		return this;
	}

	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.rezervare.setMuzicaAmbientala(muzicaAmbientala); 
		return this;
	}


	public Builder setGenMuzica(String genMuzica) {
		this.rezervare.getGenMuzica();
		return this;
	}

	
	public Builder setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
	
}
