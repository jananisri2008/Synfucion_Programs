package numberprograms;
//while loop
public class ReverseNumber 
{
	public static void main(String[] args)
	{
		System.out.println("\t\t\tReverse A Number While Loop");
		System.out.println("\t\t\t****************************");
		int n=12345,sum=0,r,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println(sum);	
	}

}
