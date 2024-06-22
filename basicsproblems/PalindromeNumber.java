package basicsproblems;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		int num=157,temp,r,sum=0;
		temp=num;
		System.out.println(temp);
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=(sum*10)+r;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	
	}

}
