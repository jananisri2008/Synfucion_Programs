package numberprograms;

public class SpyNumber
{
	public static void main(String[] args)
	{
		int num=217,sum=0,pro=1,r;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
			pro=pro*r;
		}
		if(sum==pro)
			System.out.println("spy number");
		else
			System.out.println("not spy number");
	}

}
