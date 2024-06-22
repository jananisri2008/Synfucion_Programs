package numberprograms;
//for loop
public class ReverseNumber1 
{
	public static void main(String[] args)
	{
		System.out.println("\t\t\tReverse A Number For Loop");
		System.out.println("\t\t\t************************");
		int sum=0,r;
		for(int n=1234598;n!=0;n=n/10)
		{
			r=n%10;
			sum=(sum*10)+r;
		}
		System.out.println(sum);
		
	}

}
