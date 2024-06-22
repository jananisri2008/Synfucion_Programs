package numberprograms;

public class AutomorphicRange 
{
	public static void main(String[] args)
	{
		for(int i=0;i<1000;i++)
		{
		int sqr=i*i;
		
		String num=String.valueOf(i);
		String square=String.valueOf(sqr);
		if(square.endsWith(num))
			System.out.print(i+" ");
		}
	}

}
