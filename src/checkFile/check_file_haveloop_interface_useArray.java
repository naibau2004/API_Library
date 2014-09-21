package checkFile;

import java.util.ArrayList;

public class check_file_haveloop_interface_useArray implements check_file_haveloop_interface
{

	private ArrayList<String> list = new ArrayList<String>() ;
	private ArrayList<Boolean> return_boolean_list = new ArrayList<Boolean>() ;
	
	@Override
	public ArrayList<Boolean> get_boolean() 
	{
		
		return return_boolean_list ;
	}

	@Override
	public ArrayList<String> get_exist() 
	{
		
		return list ;
	}

	@Override
	public ArrayList<String> get_noexist() 
	{

		return list ;
	}

	@Override
	public ArrayList<String> get_all() {
		ArrayList<String> all_list = new ArrayList<String>() ;
		return all_list ;
	}
}
