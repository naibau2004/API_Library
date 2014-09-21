package checkDir;

public class check_dir_noloop extends checkDir
{

	public check_dir_noloop( String path ) 
	{
//		因為多型的關係，所以要將子類別的constructor引數餵給父類別 (必需)
		super(path);
		
//		這邊指定父類別的參考變數「use_noloop_check」他的實際類型是「check_dir_noloop_interface_getBoolean()」
		use_noloop_check = new check_dir_noloop_interface_getBoolean () ;
	}

}
