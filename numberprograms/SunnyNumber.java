package numberprograms;

public class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int n=80,sqr;
		n+=1;
		if(Math.sqrt(n)%1==0)
			System.out.println("sunny");
		else
			System.out.println("not sunny");
	}

}
