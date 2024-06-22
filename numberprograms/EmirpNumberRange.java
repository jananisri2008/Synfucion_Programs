package numberprograms;

public class EmirpNumberRange 
{
	public static void main(String[] args) 
	{
		int r=0,sum=0;
		for(int i=1;i<20;i++)
		{
			sum=0;
			if(i%2!=0)
			{
				r=i%10;
				i=i/10;
				sum=(sum*10)+r;
			}
			if(sum%2!=0 && i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
