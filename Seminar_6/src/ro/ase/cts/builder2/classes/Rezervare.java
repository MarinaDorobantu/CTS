package ro.ase.cts.builder2.classes;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonmic;
	private boolean bauturaRacoritaore;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public Rezervare(boolean mancareInclusa, boolean scaunErgonmic, boolean bauturaRacoritaore,
			boolean muzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonmic = scaunErgonmic;
		this.bauturaRacoritaore = bauturaRacoritaore;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}

	public boolean isMancareInclusa() {
		return mancareInclusa;
	}

	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}

	public boolean isScaunErgonmic() {
		return scaunErgonmic;
	}

	public void setScaunErgonmic(boolean scaunErgonmic) {
		this.scaunErgonmic = scaunErgonmic;
	}

	public boolean isBauturaRacoritaore() {
		return bauturaRacoritaore;
	}

	public void setBauturaRacoritaore(boolean bauturaRacoritaore) {
		this.bauturaRacoritaore = bauturaRacoritaore;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonmic=");
		builder.append(scaunErgonmic);
		builder.append(", bauturaRacoritaore=");
		builder.append(bauturaRacoritaore);
		builder.append(", muzicaAmbientala=");
		builder.append(muzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	
}
