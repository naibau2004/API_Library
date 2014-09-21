package checkDir;


public class check_dir_haveloop_useFile extends check_dir_haveloop
{
	public check_dir_haveloop_useFile ( String path )
	{
//		因為多型的關係，所以要將子類別的constructor引數餵給父類別 (必需)
		super( path ) ;
		
//		這邊指定父類別的參考變數「useCheck」他的實際類型是「check_dir_haveloop_interface_useFile()」
		useCheck = new check_dir_haveloop_interface_useFile() ;
	}

}
