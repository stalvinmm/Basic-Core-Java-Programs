//Write a program to check given number is EVEN or ODD?

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int i=sc.nextInt();
		if(i%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
		sc.close();
	}

}
