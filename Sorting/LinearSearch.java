//wap to perform linear search

import java.util.Scanner;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5};
		int x=searchLinear(ar,4);
		if(x==-1)
			System.out.println("entered value doesnt exist");
		else
			System.out.println("index:"+x);
	}

	private static int searchLinear(int[] ar, int i) 
	{
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]==i)
				return j;
		}
		return -1;
	}
}
