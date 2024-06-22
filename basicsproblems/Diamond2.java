package basicsproblems;

public class Diamond2
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j--)
			{
				if(i>=j && i+j>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j--)
			{
				if(i<=j && i+j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}


}
