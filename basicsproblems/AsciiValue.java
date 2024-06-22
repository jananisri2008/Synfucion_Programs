//ASCII Value for particular character 
package basicsproblems;
import java.util.Scanner;
public class AsciiValue
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	System.out.println("\t\t\tASCII Values");
	System.out.println("\t\t\t************");
	System.out.println("Enter the Character: ");
	char ch=sc.next().charAt(0);
	int asvalue=ch;
	System.out.println("The ASCII Value of the "+ch+" is "+asvalue);
	}

}
