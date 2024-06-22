package numberprograms;

public class SunnyNumberRange
{
	public static void main(String[] args) 
	{
		for(int i=1;i<100;i++)
		{
			if(Math.sqrt(i+1)%1==0)
			System.out.print(i+" ");
			
		}
		
	}

}
