package numberprograms;

public class BuzzNumberRange 
{
	public static void main(String[] args)
	{
		int r=0,n=7;
		for(int i=1;i<100;i++)
		{
			r=i%10;
			if(r==n || i%7==0)
				System.out.print(i+" ");
		}
		
	}

}
