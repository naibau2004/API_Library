package checkFile_Test;

import java.util.ArrayList;

import checkFile.checkFile ;
import checkFile.check_file_haveloop_useFile;
import checkFile.check_file_haveloop_useArray;
import checkFile.check_file_noloop;


public class checkFile_Test 
{
	public static void main ( String [] args )
	{
		String list_Path = "C:\\Java-Test\\Loop_Test\\loop_list.txt" ;
		String Single_File = "C:\\Java-Test\\Loop_Test\\1.TXT" ;

		
//		多檔案測試是否存在
		checkFile b = new check_file_haveloop_useFile( list_Path ) ;	
		for ( int i = 0 ; i < b.get_all().size() ; i++ )
		{
			System.out.println ( b.get_all().get(i) + " : " +  b.get_boolean().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;
		
		
//		僅顯示存在的檔案清單
		for ( int i = 0 ; i < b.get_exist().size() ; i++ )
		{
			System.out.println ( b.get_exist().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;	
		
	
//		僅顯示不存在的檔案清單
		for ( int i = 0 ; i < b.get_noexist().size() ; i++ )
		{
			System.out.println ( b.get_noexist().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;	
		
		
//		單一檔案測試是否存在
		checkFile c = new check_file_noloop ( Single_File ) ;
		System.out.println ( c.get_noloop_boolean() ) ;
//		c.get_all();		使用非file_noloop的Method會產生錯誤
//		c.get_exist();		使用非file_noloop的Method會產生錯誤
//		c.get_noexist();	使用非file_noloop的Method會產生錯誤
//		c.get_boolean();	使用非file_noloop的Method會產生錯誤		
		System.out.println ( "-----------------------------" ) ;	
		
		
//		Array的應用
		ArrayList<String> useArray = new ArrayList<String> () ;		
		useArray.add( "C:\\Java-Test\\Loop_Test\\1.txt" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test\\2.config" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test\\3.tgz" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test\\4.jpg" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test\\5.nofile" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test\\6.txt" ) ;
		useArray.add( "C:\\Java-Test\\Loop_Test2\\web" ) ;
		
//		多檔案測試是否存在	
		checkFile a = new check_file_haveloop_useArray( useArray ) ;
		for ( int i = 0 ; i < a.get_all().size() ; i++ )
		{
			System.out.println ( a.get_all().get(i) + " : " +  a.get_boolean().get(i) ) ;
		}
		System.out.println ( "-----------------------------" ) ;	
		
//		僅顯示存在的檔案清單
		for ( int i = 0 ; i < a.get_exist().size() ; i++ )
		{
			System.out.println ( a.get_exist().get(i) ) ;
		}	
		System.out.println ( "-----------------------------" ) ;	
		
		
//		僅顯示不存在的檔案清單
		for ( int i = 0 ; i < a.get_noexist().size() ; i++ )
		{
			System.out.println ( a.get_noexist().get(i) ) ;
		}
		
		System.out.println ( "-----------------------------" ) ;		
	}
}
