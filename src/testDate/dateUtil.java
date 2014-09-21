package testDate;

//testDate		產生今日日期字串

import java.util.Calendar;

public class dateUtil 
{
	private static Calendar cal = Calendar.getInstance() ;
	
	static int yearUtil ()
	{
		return cal.get( Calendar.YEAR ) ;
	}
	
	static int monthUtil ()
	{
		int thisMonth = cal.get(Calendar.MONTH ) ;
		thisMonth += 1 ;
		
		return thisMonth ;
	}
	
	static int dayUtil ()
	{
		return cal.get(Calendar.DAY_OF_MONTH) ;
	}

	


}
