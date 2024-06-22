package ArraysPrograms;

public class LargestNumber_3 
{
	public static void main(String[] args)
	{
		int a[]= {10,30,50,60,80};
		int l1=Integer.MIN_VALUE;
		int l2=Integer.MIN_VALUE;
		int l3=Integer.MIN_VALUE;
		for(int n:a)
		{
			if(n>l1)
			{
				l3=l2;
				l2=l1;
				l1=n;
			}
			else if(n>l2)
			{
				l3=l2;
				l2=n;
			}
			else if(n>l3)
			{
				l3=n;
			}
		}
		System.out.println("1 largest no "+l1);
		System.out.println("2 largest no "+l2);
		System.out.println("3 largest no "+l3);
	}

}
