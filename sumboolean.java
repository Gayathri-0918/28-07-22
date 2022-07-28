package sampleprogram1;
import java.util.Scanner;

public class sumboolean {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter the first integer");
	    int x=in.nextInt();
	    System.out.println("Enter the second integer");
	    int y=in.nextInt();
	    System.out.println("Enter the third integer");
	    int z=in.nextInt();
	    System.out.println("the result is:"+sumoftwo(x ,y ,z));
	  }
    public static boolean sumoftwo(int p,int q,int r) 
    {
    	return((p+q)==r||(p+r)==q||(q+r)==p);
    }

}
