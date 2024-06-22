package numberprograms;
//Method
public class ReverseNumber2 
{
	public static void reverse(int n)
	{
		int r,sum=0;
		while(n>0) 
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println("\t\t\tReverse NUmber Using Method");
		System.out.println("\t\t\t*****************************");
	System.out.println(sum);
	}
	public static void main(String[] args)
	{
		int n=1234;
		reverse(n);
	}
}
