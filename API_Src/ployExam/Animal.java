package ployExam;

public abstract class Animal {
	
	public String name ;
	public double tall ;
	public double weight ;
	
	//建立一個參考型別為Machine的成員
	private Machine ma ;
	
	public abstract void bark ();
	
	public void light (){
		ma.light();
	}
	
	
}
