package basicsproblems;
import java.util.Scanner;
public class Factorial
{
 static Scanner sc=new Scanner(System.in);
 public static void main(String[] args)
 {
	 System.out.println("\t\t\tFactorial");
	 System.out.println("\t\t\t**********");
	 System.out.println("enter the number");
	 int n=sc.nextInt();
	 int fact=1;
	 
	 for(int i=1;i<=n;i++)
	 {
		 fact=fact*i;
	  }
	 System.out.println("the factorial of the "+n+" is "+fact);
		
	
}
}
