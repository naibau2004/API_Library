package checkDir;

import java.io.File;
import java.util.ArrayList;


public class check_dir_haveloop_interface_useFile implements check_dir_haveloop_interface
{

	@Override
	public ArrayList<Boolean> get_boolean() 
	{
//		這兩個ArrayList一定要放在這個方法裡面，否則會有不正常的值增加
		ArrayList<String> check_list = check_dir_haveloop.open_dir();
		ArrayList<Boolean> return_boolean_list = new ArrayList<Boolean>() ;
		
//		這邊將是否存在的結果塞入「return_boolean_list」的ArrayList中
		for ( int i = 0 ; i < check_list.size() ; i++ )
		{
			File file = new File ( check_list.get(i) ) ;
				
			if ( file.exists() && file.isDirectory() )
			{
				return_boolean_list.add( true ) ;			
			}
			else
			{
				return_boolean_list.add( false ) ;
			}
		}
	
		return return_boolean_list ;	
	}

	
	@Override
	public ArrayList<String> get_exist() 
	{
		ArrayList<String> check_list = check_dir_haveloop.open_dir() ;
		ArrayList<String> return_path_list = new ArrayList<String>() ;
		
		for ( int i = 0 ; i < check_list.size() ; i++ )
		{
			File file = new File ( check_list.get(i) ) ;
			if ( file.exists() && file.isDirectory()  )
			{
				return_path_list.add( check_list.get(i) ) ;
			}
		}
		
		return return_path_list ;		
	}
		
	
	@Override
	public ArrayList<String> get_noexist() 
	{
		ArrayList<String> check_list = check_dir_haveloop.open_dir();
		ArrayList<String> return_path_list = new ArrayList<String>() ;
		
		for ( int i = 0 ; i < check_list.size() ; i++ )
		{
			File file = new File ( check_list.get(i) ) ;
			if ( ! file.exists()  )
			{
				return_path_list.add( check_list.get(i) ) ;
				
			}else if ( file.exists() && ! file.isDirectory() )
			{
				return_path_list.add( check_list.get(i) ) ;
			}
		}
		
		
		return return_path_list ;
	}


	@Override
	public ArrayList<String> get_all()
	{
		ArrayList<String> all_list = check_dir_haveloop.open_dir() ;
		return all_list ;
	}
	
}
