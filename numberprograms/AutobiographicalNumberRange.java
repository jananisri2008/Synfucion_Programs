package numberprograms;

public class AutobiographicalNumberRange 
{
	public static void main(String[] args) 
	{
		int sum=0,count=0,r;
		for(int i=1;i<1000;i++)
		{
			count++;
			sum=0;
			while(i>0)
			{
				count++;
				r=i%10;
				i=i/10;
				sum=sum+r;
			}
			if(sum==count)
				System.out.print(i+" ");
		}
		
	}

}
