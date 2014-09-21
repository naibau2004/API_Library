package checkFile;

import java.util.ArrayList;

public class check_file_haveloop_useArray extends check_file_haveloop
{
	public check_file_haveloop_useArray ( ArrayList<String> array_path )
	{
//		因為多型的關係，所以要將子類別的constructor引數餵給父類別 (必需)
		super( array_path ) ;
		
//		這邊指定父類別的參考變數「useCheck」他的實際類型是「check_file_haveloop_interface_useArray()」
		useCheck = new check_file_haveloop_interface_useArray() ;
	}
	
}
