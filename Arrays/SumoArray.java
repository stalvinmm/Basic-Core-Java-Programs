// wap to print sum of even/odd array elements
import java.util.Scanner;

public class SumoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		int ar[] = new int[size];
		System.out.println("enter " + size + " array elements:");
		for (int i = 0; i < size; i++) // {1 2 3 4 5} = 15
		{
			ar[i] = sc.nextInt();
		}
		int se = 0, so = 0;
		for (int i = 1; i <= ar.length; i++) {
			if (i % 2 == 0)
				se = se + ar[i - 1];
			else
				so = so + ar[i - 1];

		}
		System.out.println("sum of even-->" + se);
		System.out.println("sum of odd-->" + so);
		sc.close();

	}

}
