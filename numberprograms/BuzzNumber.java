package numberprograms;

public class BuzzNumber 
{
	public static void main(String[] args) 
	{
		int num=15,r=0,n=7;
		
			r=num%10;
		
			if(r==n || num%7==0)
			System.out.println("Buzz number");
		else
			System.out.println("not buzz number");
		
	}

}
