import java.util.Scanner;
public class Access2DArray2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no of rows: ");
		int r=sc.nextInt();
		System.out.println("no of elements in each row: ");
		int e=sc.nextInt();
		
		int am[][]=new int[r][e];
		System.out.println("enter "+(r*e)+" array elements");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<e;j++)
			{
				am[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<e;j++)
			{
				System.out.print(am[i][j]+" ");
			}
			System.out.println();
		}
	}

}
