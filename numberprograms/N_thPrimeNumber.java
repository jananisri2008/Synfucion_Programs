package numberprograms;

public class N_thPrimeNumber
{
	public static void main(String[] args) 
	{
		int num=3,count=0,n=1,i;
		while(count<num)
		{
			n=n+1;
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
					break;
			}
			if(i==n)
			{
				count+=1;
			}
			System.out.print(n+" ");
		}
	}
}
		
