package numberprograms;

public class EmirpNumber
{
	public static void main(String[] args) 
	{
		int num=28,r=0,sum=0,temp;
		{
			temp=num;
		if(num%2!=0)
			{
				r=num%10;
				num=num/10;
				sum=(sum*10)+r;
			}
		
			if(sum%2!=0 && num%2!=0)
			
				System.out.println("emirp number");
			
			else
				System.out.println("not emirp number");
			
		}
		
	}
}

