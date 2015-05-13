package ployExam;

public class TestAnimal {
	
	public static void main ( String [] args ){
		
		Animal d = new Dog () ;
		d.bark();
		
		//可以同時使用Dog與MachineDog的方法
		d.ma.bark();
		d.ma.light();

	}
}
