package basicsproblems;

public class PrimeNumber1_100
{
	public static void main(String[] args)
	{
		System.out.println("prime number between 1 to 100 ");
		int i,j,n;
		
		for(i=2;i<= 100;i++)
		{
			n=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					n=1;
			}
			if(n==0)
				System.out.print(i+" ");
		}
	}
	
}
