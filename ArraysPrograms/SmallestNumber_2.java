package ArraysPrograms;

public class SmallestNumber_2 
{
	public static void main(String[] args) 
	{
		int[]a= {10,30,50,60,80};
		int s1=Integer.MAX_VALUE;
		int s2=Integer.MAX_VALUE;
		
		for(int n:a)
		{
			if(n<s1)
			{
				s1=s2;
				s2=n;
			}
			else if(n<s2)
			{
				s2=n;
			}
		}
		System.out.println("1 smallest no "+s1);
		System.out.println("2 smallest no "+s2);
	}

}
