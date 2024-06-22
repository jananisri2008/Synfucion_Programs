package numberprograms;

public class PerfectCubeRange 
{
	public static void main(String[] args)
	{
		for(int i=1;i<100;i++)
		{
			int cube=(int)Math.cbrt(i);
			if(i==cube*cube*cube)
				System.out.print(i+" ");
		}
		
	}

}
