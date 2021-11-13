import java.util.Scanner;

public class PrintBiggest 
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size of array:");
//		int size=sc.nextInt();
//		int ar[]=new int[size];  // { 4 2 1 5 7 }
//		System.out.println("enter "+size+" array elements:");
//		for(int i=0;i<size;i++)
//		{
//			ar[i]=sc.nextInt();
//		}
		int ar[]= {1,9,3,4,5};
		int temp[]=new int[1];
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp[0]=ar[j];
					ar[j]=ar[i];
					ar[i]=temp[0];
				}
			}
		}
//		for(int i=0;i<size;i++)
//		{
//			System.out.println("a["+i+"]-->"+ar[i]);
//		}
		System.out.println("the biggest element is:"+ar[ar.length-1]);
		
	}
}
