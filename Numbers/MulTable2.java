//Write a program to display MULTIPLICATION TABLES?
import java.util.Scanner;

public class MulTable2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n: ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" * "+i+" = "+j*i+"\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
