import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for a: ");
		int a=sc.nextInt();		//2
		System.out.println("enter the value for b: ");
		int b=sc.nextInt();		//3
		System.out.println("Before Swapping \n a: "+a+" b: "+b +"\n");
		int t;
		t=a; //2
		a=b; //3
		b=t; //2
		System.out.println("After Swapping \n a: "+a+" b: "+b +"\n");
		sc.close();
	}

}
