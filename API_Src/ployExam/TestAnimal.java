package ployExam;

public class TestAnimal {
	
	public static void main ( String [] args ){
		
		Animal d = new Dog () ;
		d.bark();


		Animal x = new MachineDog () ;
		x.bark();
		x.light();
		
		
		Animal c = new MachineCat () ;
		c.bark();
		c.light();
		
	}
}
