package testDate;

public class testDate 
{
	public static void main ( String [] args )
	{
		int thisYear = dateUtil.yearUtil() ;
		int thisMonth = dateUtil.monthUtil() ;
		int thisDay = dateUtil.dayUtil() ;
		
		System.out.println ( thisYear + "-" + thisMonth + "-" + thisDay ) ;
	}
}
