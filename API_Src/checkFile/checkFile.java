package checkFile;

import java.util.ArrayList;

public abstract class checkFile 
{
//	建立參考變數「useCheck」，參考類型為「check_file_haveloop_interface」
	check_file_haveloop_interface useCheck ;
	
//	建立參考變數「use_noloop_check」，參考類型為「check_file_noloop_interface」
	check_file_noloop_interface use_noloop_check ;	
	
	
	
//	建立兩個變數用來承接建位物件時的路徑引數，因為「getPath」跟「getArray」的方法為「static」，所以使用到的變數也得為「static」
	private static String path ;
	private static ArrayList<String> array_path ;
	
	
	
//	這個方法給use_File使用
	checkFile ( String userPath )		
	{
		this.setPath( userPath ) ;
	}
	
	private void setPath( String set_path ) 
	{
		path = set_path ;
	}
	
	static String getPath() 
	{
		return path ;
	}

	
//這個方法給use_Array使用
	checkFile ( ArrayList<String> userArray )		
	{
		this.setPath( userArray ) ;
	}
	
	private void setPath( ArrayList<String> setArray ) 
	{
		array_path = setArray ;
	}
	
	static ArrayList<String> getArray () 
	{
		return array_path ;
	}

	
	
//	下列為實際在應用的各種方法
	public ArrayList<String> get_all()				//取得所有路徑下檔案清單
	{
		return useCheck.get_all();
	}

	public ArrayList<Boolean> get_boolean()		//取得所有檔案的存在於否的布林值
	{
		return useCheck.get_boolean();
	}
	
	public ArrayList<String> get_exist()			//取得存在之檔案清單
	{
		return useCheck.get_exist();
	}
	
	public ArrayList<String> get_noexist()			//取得不存在之檔案清單
	{
		return useCheck.get_noexist();
	}
	
	public boolean get_noloop_boolean ()			//單一檔案測試
	{
		return use_noloop_check.get_boolean() ;
	}
}
