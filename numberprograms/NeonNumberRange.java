package numberprograms;

public class NeonNumberRange 
{
	public static void main(String[] args) 
	{
		int i,sqr,r,sum;
		for(i=1;i<=100;i++)
		{
			sqr=i*i;
		    sum=0;
		    
			while(sqr<0)
			{
				r=sqr%10;
				sum=sum+r;
				sqr=sqr/10;
			}
			if(sum==i)
				System.out.print(i+" ");
			}
		}
}

