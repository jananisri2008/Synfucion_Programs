package numberprograms;

public class TechNumberRange 
{
	public static void main(String[] args)
	{
		for(int i=1;i<100;i++)
		{
			int r=i%100;
			int n=i/100;
			int sum=r+n;
			if(i==(sum*sum))
				System.out.print(i+" ");
		
		}
		
	}

}
