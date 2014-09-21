package checkFile;

import java.io.File;

class check_file_noloop_interface_getBoolean implements check_file_noloop_interface
{

	@Override	//這裏是真正要被實作的地方
	public boolean get_boolean()
	{
		

		File file = new File ( checkFile.getPath() ) ;	//開啟檔案
		
		if ( file.exists() )
		{
			if ( file.isFile() == true )	//要確定這個是檔案，而不是資料夾之類的東西
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
