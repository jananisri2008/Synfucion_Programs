package numberprograms;

public class PerfectSquareNumberRange 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<100;i++)
		{
			int root=(int)Math.sqrt(i);
			if(i==root*root)
				System.out.print(i+" ");
		}
		
	}

}
