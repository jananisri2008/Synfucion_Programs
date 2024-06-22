package basicsproblems;
import java.util.*;
public class PalindromeString
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tPalindrome String");
		System.out.println("\t\t\t****************");
		
		System.out.println("enter a word");
		String str1=sc.nextLine();
		String str2="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		if(str2.equals(str1))
				System.out.println("palindrome");
		else
 			System.out.println("not palindrome");
					
	}

}
