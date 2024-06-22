package ArraysPrograms;

public class Even_OddPositionArray 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		for(int j=0;j<a.length;j=j+2 )
		{
			System.out.print(a[j]);
		}
		
	}

}
