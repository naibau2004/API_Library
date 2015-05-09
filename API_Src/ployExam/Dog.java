package ployExam;

public class Dog extends Animal implements Machine {

	public Dog (){
		//父類別的ma在Dog這個類別中為MachineDog
		super.ma = new MachineDog () ;
	}
	
	@Override
	public void light() {
		ma.light();
		
	}

	@Override
	public void bark() {		
		System.out.println("汪汪汪");
	}
	
}
