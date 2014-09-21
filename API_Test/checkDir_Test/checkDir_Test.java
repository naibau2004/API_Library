package checkDir_Test;

import java.util.ArrayList;

import checkDir.checkDir;
import checkDir.check_dir_haveloop_useArray;
import checkDir.check_dir_haveloop_useFile;
import checkDir.check_dir_noloop;

public class checkDir_Test 
{
	public static void main ( String [] args )
	{
		String list_Path = "C:\\Java-Test\\Loop_Test2\\loop_list2.txt" ;
		String Single_File = "C:\\Java-Test\\Loop_Test2\\bin" ;

		
//		多資料夾測試是否存在
		checkDir b = new check_dir_haveloop_useFile( list_Path ) ;	
		for ( int i = 0 ; i < b.get_all().size() ; i++ )
		{
			System.out.println ( b.get_all().get(i) + " : " +  b.get_boolean().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;
		
		
//		僅顯示存在的資料夾清單
		for ( int i = 0 ; i < b.get_exist().size() ; i++ )
		{
			System.out.println ( b.get_exist().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;	
		
	
//		僅顯示不存在的資料夾清單
		for ( int i = 0 ; i < b.get_noexist().size() ; i++ )
		{
			System.out.println ( b.get_noexist().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;	
		
		
//		單一資料夾測試是否存在
		checkDir c = new check_dir_noloop ( Single_File ) ;
		System.out.println ( c.get_noloop_boolean() ) ;
//		c.get_all();		使用非file_noloop的Method會產生錯誤
//		c.get_exist();		使用非file_noloop的Method會產生錯誤
//		c.get_noexist();	使用非file_noloop的Method會產生錯誤
//		c.get_boolean();	使用非file_noloop的Method會產生錯誤		
		System.out.println ( "-----------------------------" ) ;	
		
		
//		Array的應用
		ArrayList<String> useArray = new ArrayList () ;		
		useArray.add( "C:\\Java-Test\\Loop_Test2\\bin" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test2\\log" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test2\\main" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test2\\src" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test2\\web" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test2\\nofile" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test\\4.jpg" ) ;
		
		
//		多資料夾測試是否存在	
		checkDir a = new check_dir_haveloop_useArray( useArray ) ;
		for ( int i = 0 ; i < a.get_all().size() ; i++ )
		{
			System.out.println ( a.get_all().get(i) + " : " +  a.get_boolean().get(i) ) ;
		}
		System.out.println ( "-----------------------------" ) ;	
		
//		僅顯示存在的資料夾清單
		for ( int i = 0 ; i < a.get_exist().size() ; i++ )
		{
			System.out.println ( a.get_exist().get(i) ) ;
		}	
		System.out.println ( "-----------------------------" ) ;	
		
		
//		僅顯示不存在的資料夾清單
		for ( int i = 0 ; i < a.get_noexist().size() ; i++ )
		{
			System.out.println ( a.get_noexist().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;		
	
	}
}
