package numberprograms;

public class TechNumber 
{
	public static void main(String[] args)
	{
		int n=20248,count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
		if(count%2==0)
			System.out.println("tech number");
		else
			System.out.println("not tech number");
		
	}

}
