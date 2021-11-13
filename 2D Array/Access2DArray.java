//wap to access 2d array elements
public class Access2DArray 
{
	public static void main(String[] args) 
	{
		int am[][]= {{1,5,7,9},{2,4,6,8},{4,7,9,5}};  
		//			  0 1 2 3   0 1 2 3   0 1 2 3   
		//				 0         1         2         
		
		System.out.println("no of rows: "+am.length);//am[2].length-1
		System.out.println("no of elements in first row: "+am[0].length);
		System.out.println("last row last element: "+am[am.length-1][am[am.length-1].length-1]);

		for(int i=0;i<am.length;i++)
		{
			for(int j=0;j<am[i].length;j++)
			{
				System.out.println("am["+i+"]["+j+"]-->"+am[i][j]);
			}
		}
	}

}
