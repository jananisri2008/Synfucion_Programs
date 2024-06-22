package ArraysPrograms;

public class Largest_SmallestNumber 
{
	public static void main(String[] args)
	{
		int a[]= {12,45,36,28};
		int small=a[0];
		int large=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
				large=a[i];
			else if(a[i]<small)
				small=a[i];
		}
		System.out.println(large);
		System.out.println(small);
	}

}
