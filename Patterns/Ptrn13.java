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
		for(int i=n;i>0;i--)		//row
		{
			for(int j=1;j<=n;j++)	//column
			{
				System.out.print((char)(k+97)+" ");
				k++;
			}
			System.out.println();
		}
		sc.close();
	}

}
