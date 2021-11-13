//print numbers in reverse order

import java.util.Scanner;

public class PrintReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		
		for(int i=n;i>=0;i--) {
			System.out.println(i);
			sc.close();
		}
	}

}
