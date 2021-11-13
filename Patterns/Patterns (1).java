/*	 N=5
 		*
		*
		*
		*
		*
*/	


import java.util.Scanner;
public class Ptrn01 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines: ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("*");
		}
		sc.close();
	}
}
