package checkFile;

import java.io.File;
import java.util.ArrayList;

public class check_file_haveloop_interface_useArray implements check_file_haveloop_interface
{	
	@Override
	public ArrayList<Boolean> get_boolean() 
	{
		ArrayList<String> array_list = checkFile.getArray() ;
		ArrayList<Boolean> return_boolean_list = new ArrayList<Boolean>() ;
		
		for ( int i = 0 ; i < array_list.size() ; i++ )
		{
			
			File file = new File ( array_list.get(i) ) ;
			
			if ( file.exists() && ! file.isDirectory() )
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
		ArrayList<String> array_list = checkFile.getArray() ;
		ArrayList<String> return_path_list = new ArrayList<String>() ;
		
		for ( int i = 0 ; i < array_list.size() ; i++ )
		{
			File file = new File ( array_list.get(i) ) ;
			
			if ( file.exists() && ! file.isDirectory() )
			{
				return_path_list.add( array_list.get(i) ) ;		
			}
		}
		
		return return_path_list ;
	}

	@Override
	public ArrayList<String> get_noexist() 
	{
		ArrayList<String> array_list = checkFile.getArray() ;
		ArrayList<String> return_path_list = new ArrayList<String>() ;
		
		for ( int i = 0 ; i < array_list.size() ; i++ )
		{
			File file = new File ( array_list.get(i) ) ;
			
			if ( ! file.exists() )
			{
				
				return_path_list.add( array_list.get(i) ) ;
				
			}else if ( file.exists () && ! file.isFile() )
			{
				return_path_list.add( array_list.get(i) ) ;
			}
		}
				
		return return_path_list ;
		
	}

	@Override
	public ArrayList<String> get_all() 
	{
//		這邊可以直接將原本做為引數的ArrayList回傳
		return checkFile.getArray() ;
	}
}
