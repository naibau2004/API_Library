package checkFile;

public class check_file_noloop extends checkFile
{
	public check_file_noloop( String path ) 
	{
//		因為多型的關係，所以要將子類別的constructor引數餵給父類別 (必需)
		super(path);
		
//		這邊指定父類別的參考變數「use_noloop_check」他的實際類型是「check_file_noloop_interface_getBoolean()」
		use_noloop_check = new check_file_noloop_interface_getBoolean () ;
	}

//	public check_file_noloop( ArrayList<String> array_path ) 
//	{
//		因為多型的關係，所以要將子類別的constructor引數餵給父類別 (必需)
//		super(array_path);
		
//		因為這個方法不使用ArrayList(他只有單一路徑)，所以這邊就不實作接下來的宣告
//		use_noloop_check = new check_file_noloop_interface_getBoolean () ;
//	}
}
