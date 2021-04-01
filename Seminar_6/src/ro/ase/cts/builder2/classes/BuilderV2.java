package ro.ase.cts.builder2.classes;

public class BuilderV2 implements IBuilder{
	private boolean mancareInclusa;
	private boolean scaunErgonmic;
	private boolean bauturaRacoritaore;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public BuilderV2() {
		super();
		this.mancareInclusa = false;
		this.scaunErgonmic = false;
		this.bauturaRacoritaore = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = 0;
	}
	public BuilderV2(int codRezervare) {
		super();
		this.mancareInclusa = false;
		this.scaunErgonmic = false;
		this.bauturaRacoritaore = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = codRezervare;
	}

	
	public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public BuilderV2 setScaunErgonmic(boolean scaunErgonmic) {
		this.scaunErgonmic = scaunErgonmic;
		return this;
	}

	public BuilderV2 setBauturaRacoritaore(boolean bauturaRacoritaore) {
		this.bauturaRacoritaore = bauturaRacoritaore;
		return this;
	}

	public BuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public BuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}


	public BuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(mancareInclusa, scaunErgonmic, bauturaRacoritaore,
				 muzicaAmbientala, genMuzica, codRezervare);
		return rezervare;
	}
	
}
