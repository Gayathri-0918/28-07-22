package sampleprogram1;
import java.util.Scanner;

public class touppercase {

	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
	     System.out.print("Input a String: ");
		 String line = in.nextLine();
		 line = line.toUpperCase();
		 System.out.println(line); 

	}

}
