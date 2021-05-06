package ro.ase.cts.command.classes;

public class ComandaConstruire extends Command {

	public ComandaConstruire(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().construire(super.getSuma());	
	}

}
