package ployExam;

/*
 *Last update : 2015/05/22 01:02
 *User Story：
 */

public class MachineCat extends Animal implements Machine{
	
	@Override
	public void bark() {
		System.out.println("喵喵喵");
		
		
	}@Override
	public void light() {
		System.out.println("登登登");
		
	}
	

}
