package numberprograms;

public class NeonNumber 
{
	public static void main(String[] args) 
	{
		int num=11,sqr,r,sum=0;
		sqr=num*num;
		while(sqr!=0)
		{
			r=sqr%10;
			sqr=sqr/10;
			sum+=r;
		}
		if(num==sum)
			System.out.println("neon number");
		else
			System.out.println("not neon number");
	}

}
