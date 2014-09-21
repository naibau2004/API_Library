package useDate1_Test;

import useDate1.dateUtil;

public class useDate1_Test 
{
	public static void main ( String [] args )
	{
		
		dateUtil newDate = new dateUtil() ;
		
		int thisYear = newDate.yearUtil() ;
		int thisMonth = newDate.monthUtil() ;
		int thisDay = newDate.dayUtil() ;
		
		System.out.println ( "theYear : " + thisYear ) ;
		System.out.println ( "theMonth : " + thisMonth ) ;
		System.out.println ( "theDay : " + thisDay ) ;
		
		String today = newDate.today("/") ;
		
		System.out.println ( "today (use \"/\") : " + today ) ;
		
	}
}
