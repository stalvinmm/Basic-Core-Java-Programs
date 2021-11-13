/*	N=5
		a b c d e 
		f g h i j
		k l m n o  
		p q r s t 
		u v w x y    
*/

import java.util.Scanner;
public class Ptrn13
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		
		int k=0;								
		for(int i=1;i<=n;i++)		//row		A=65	a=97
		{
			for(int j=1;j<=n;j++)	//column	
			{
				System.out.print((char)(k+97)+" ");
				k++;
				if(k==26)
					k=0;
			}
			System.out.println();
		}
		sc.close();
	}

}
