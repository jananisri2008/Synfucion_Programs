package basicsproblems;
import java.util.Scanner;
public class PrimeNumber 
{
	static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) 
 {
	 System.out.println("\t\t\tPrime Number");
	 System.out.println("\t\t\t*************");
	 System.out.println("enter the number");
	 int n=sc.nextInt();
	 
	 if(n%2!=0)
	 {
		 System.out.println(n+" prime number is");
	 }
	 else
	 {
		 System.out.println(n+" Not a prime number is");
	 }
   	 
 }
}

