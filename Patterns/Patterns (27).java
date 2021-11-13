/*	N=5
		a b c d e 
		f g h i j
		k l m n o  
		p q r s t 
		u v w x y    
*/

import java.util.Scanner;
public class Ptrn14
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		
		char ch='a';								
		for(int i=1;i<=n;i++)		//row		A=65	a=97
		{
			for(int j=1;j<=n;j++)	//column	
			{
				System.out.print(ch+" ");
				ch++;
				if(ch>'z')
					ch='a';
			}
			System.out.println();
		}
		sc.close();
	}

}

