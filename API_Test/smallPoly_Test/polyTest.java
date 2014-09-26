package smallPoly_Test;

import smallPoly.child1;
import smallPoly.child2;
import smallPoly.father_class;

public class polyTest 
{
	public static void main ( String [] args )
	{
		father_class a = new child1 () ;	
		a.getMethod();

		father_class b = new child2 () ;
		b.getMethod();

	}
}
