/*		
	N=5
		* * * * *
*/


import java.util.Scanner;
public class Ptrn2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("* ");
		}
		sc.close();
	}

}
