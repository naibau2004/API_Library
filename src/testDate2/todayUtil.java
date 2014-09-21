package testDate2;

import java.util.Calendar;

public abstract class todayUtil 
{
	private static Calendar cal = Calendar.getInstance() ;
	private static int thisYear = yearUtil() ;
	private static int thisMonth = monthUtil() ;
	private static int thisDay = dayUtil() ;
	
	private static int yearUtil ()
	{
		return cal.get( Calendar.YEAR ) ;
	}
	
	private static int monthUtil ()
	{
		int thisMonth = cal.get(Calendar.MONTH ) ;
		thisMonth += 1 ;
		
		return thisMonth ;
	}
	
	private static int dayUtil ()
	{
		return cal.get(Calendar.DAY_OF_MONTH) ;
	}
	
	//因為這邊使用static，所以只能存取static的方法與變數 ( 上方全要變成static )
	public static String today( String a)		
	{
		return thisYear + a + thisMonth + a + thisDay ;
	}
}
