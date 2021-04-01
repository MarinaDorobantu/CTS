package ro.ase.cts.builder2.program;

import ro.ase.cts.builder2.classes.BuilderV2;
import ro.ase.cts.builder2.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		
		BuilderV2 builder = new BuilderV2();
		builder.setBauturaRacoritaore(true);
		builder.setMancareInclusa(true);
		
		Rezervare rez1 = builder.setCodRezervare(20).build();
		Rezervare rez2 = builder.setCodRezervare(21).build();
		System.out.println(rez1.toString());
		System.out.println(rez2.toString());
	}
}
