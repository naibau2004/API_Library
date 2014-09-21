package NineNine;

//NineNine		九九乘法表

public class NineNine 
{
	public static void main ( String [] args )
	{
		for ( int j = 1 ; j <= 9 ; j++ )		//for ( int y = 1 ; y < 10 ; y++ )
		{
			for ( int i = 2 ; i <= 9 ; i++ )	//for ( int x = 2 ; x < 10 ; x++ )
			{
				System.out.print ( i + " X " + j + " = " + i*j + "\t" ) ;
			}
			System.out.println () ;
		}
	}
}
