package myRandomNum;

//myRandomNum	產生範圍隨機數，並指定產出數量與是否重覆

public class myRandomNum 
{
	private int a ;
	private int b ;
	private int c ;
	private boolean d ;
	
	public void setNumRange ( int x , int y , int w , boolean z )
	{
		d = z ;
		
		if ( y < x )		//取最大值為b
		{
			a = y ;
			b = x ;
		}
		else
		{
			a = x ;
			b = y ;
		}
		
		if ( w < 0 )		//若產出數量為負數，則產出數量則為0
		{
			c = 0 ;
		}
		else
		{
			c = w ;
		}
		
		//確保範圍內可以產出指定數量，如10-11無法產出3個不重覆數
		if ( ( b - a + 1 ) < c & d == false )		
		{
			c = 0 ;
		}
	}
	
	public int [] yourList ()
	{
		//最主要的結果陣列
		int [] myList = new int [c] ;
		
		// d = true，表示產出數可重覆
		if ( d == true )
		{
			for ( int i = 0 ; i < c ; i++  )
			{
				myList[i] = (int)(Math.random() * (b-a+1))+a ;
			}
			
			return myList ;
		}
		else
		{
			//建立一個暫存陣列，將a到b的範圍數值存入此陣列中
			int [] tempList = new int [b-a+1];
	
			for ( int i = a , j = 0 ; i < b+1 ; j++ )
			{
				tempList[j] = i ;
				i++ ;
			}
			
			int tempSize = tempList.length ;
			int ranNum;
			
			/*以下程式碼之思考路線
			 * 先產生a - b範圍數放到陣列，接下來隨機選a - b範圍數
			 * 假設範圍為0-9，如果選到3就把最後一個數字移到陣列3的位置上 
			 * 所以變成0 1 2 9 4 5 6 7 8
			 * 接下來減少隨機數字的範圍0~8
			 * 可以保證只要跑10次 不會有重複的情況
			 */
			for ( int i = 0 ; i < c ; i ++ , tempSize-- )
			{
				ranNum = (int)(Math.random() * tempSize ) ;
				myList[i] = tempList[ranNum] ;
				tempList[ranNum] = tempList[tempSize-1] ;
			}
			
			return myList ;		
		}
	}
}
