/*N=5									i		space		digit
	          a          			    1		4			1
			b b b            			2		3			3
		  c c c c c 					3		2			5
		d d d d d d d			    	4		1			7
	  e e e e e e e e e		           	5		0			9
	   									
	  1 2 3 4 5							i		n-i			(2*i)-1
*/

import java.util.Scanner;
public class Ptrn45
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		char ch='a';
		for(int i=1;i<=n;i++)				//row 
		{
			for(int j=1;j<=n-i;j++)			//space
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=(2*i)-1;j++)		//digits
			{
				System.out.print(ch+" ");
				
			}
			ch++;
			
			System.out.println();
			sc.close();
		}
	}

}

