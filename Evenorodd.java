package sampleprogram1;
import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		if(n%2==0)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("1");
		}
		

	}

}
