import java.util.Scanner;

public class InsertArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array:");
		int len=sc.nextInt();
		int arr[]=new int[len];  //declaration+allocation
		System.out.println("enter "+len+" elements:5");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
			
	}
}
