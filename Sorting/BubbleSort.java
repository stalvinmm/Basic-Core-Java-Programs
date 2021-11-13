import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("enter"+len+" elements:");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("before sorting:");
		for(int i=0;i<len;i++)
		{
			System.out.println("arr["+i+"] -> "+arr[i]);
		}
		//    ^^ to enter a array ^^
		System.out.println("after sorting:");
		sortArray(arr);
	}

	private static void sortArray(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++) //first element
		{
			for(int j=i+1;j<arr.length;j++) //next element
			{
				if(arr[i]>arr[j]) //3 2 1->2 3 1->1 3 2->1 2 3
				{
					int temp=arr[i]; //3
					arr[i]=arr[j];	 //2
					arr[j]=temp;	 //3
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] -> "+arr[i]);
		}
	}
}
