package ro.ase.cts.command.classes;

public class ComandaRetragere extends Command{

	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().retragere(super.getSuma());
	}

}
