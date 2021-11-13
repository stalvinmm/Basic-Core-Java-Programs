//Write a program to display MULTIPLICATION TABLES?
import java.util.Scanner;

public class MulTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Multiplication table of: ");
	int n=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(n+" * "+i+"  = "+n*i);
	}
	sc.close(); 
}
}
