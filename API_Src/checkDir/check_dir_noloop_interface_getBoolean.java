package checkDir;

import java.io.File;


class check_dir_noloop_interface_getBoolean implements check_dir_noloop_interface
{

	@Override
	public boolean get_boolean() 
	{
		File file = new File ( checkDir.getPath() ) ;	//開啟資料夾
		
		if ( file.exists() )
		{
			if ( file.isDirectory() == true )			//要確定這個是資料夾，而不是檔案之類的東西
			{
				return true ;
			}
			else
			{
				return false ;
			}
		}
		else if ( ! file.exists () )
		{
			return false ;
		}
		else
		{
			return false ;
		}
	}
}
