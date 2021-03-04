package main;

import classes.Giraffe;
import classes.Zebra;
import classes.Zoo;
import classes.Zookeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Seminar 1");
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);
		
		Giraffe giraffe1=new Giraffe("giraffe 1",10);
		Giraffe giraffe2 = new Giraffe("giraffe 2", 15, 200);
		zoo.addAnimal(giraffe1);
		zoo.addAnimal(giraffe2);
		
		zoo.feedAllAnimals();
		
		Zebra zebra1= new Zebra("zebra1", 7);
		Zebra zebra2= new Zebra("zebra2", 10, 132);
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		
		zoo.feedAllAnimals();
	}

}
