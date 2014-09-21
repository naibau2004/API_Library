package myRandomNum_Test;

import myRandomNum.myRandomNum;

public class myRandomNum_Test {

	public static void main ( String [] args )
	{
		
		myRandomNum list = new myRandomNum () ;
		
		list.setNumRange( 10 , 20 , 5 , false ) ;	//產出10-20的5個數字，不能重覆
		
		int [] result = list.yourList() ;
		
		for ( int item : result )
		{
			System.out.print ( item + " " ) ;
		}
		
	}
}
