package checkFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

abstract class check_file_haveloop extends checkFile
{

	check_file_haveloop( String path ) 
	{
		super( path ) ;
	}
	
	check_file_haveloop( ArrayList<String> array_path ) 
	{
		super( array_path ) ;
	}
	


	static ArrayList<String> open_file ()
	{
		ArrayList<String> check_list = new ArrayList<String>() ;
		
		try
		{
//			標準開啟檔案的程式碼
			FileReader fr = new FileReader( checkFile.getPath() );
			BufferedReader br = new BufferedReader(fr);
			
//			這邊要將path的值使用迴圈塞入check_list 陣列中
			while ( br.ready() ) 
			{
				check_list.add( br.readLine() );
			}
			
			br.close();
			fr.close();
		
		} catch (Exception ex) 
		{
			System.out.println("some Error !");
			ex.printStackTrace();
		}
		
		return check_list ;
	}
}
