package ployExam;

public class MachineDog extends Animal implements Machine {

	@Override
	public void bark() {
		System.out.println("機機機機機");	
	}
	
	@Override
	public void light() {
		System.out.println("嗡嗡嗡嗡嗡");
		
	}
	
}
