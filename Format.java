package sampleprogram1;
import java.util.Scanner;

public class Format {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=obj.nextInt();
		System.out.printf("%d+%d%d+%d%d%d",n,n,n,n,n,n);

	}

}
