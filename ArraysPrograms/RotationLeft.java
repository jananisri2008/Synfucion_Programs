package ArraysPrograms;

import java.util.Arrays;

public class RotationLeft 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		int n=1;
		int r=n;
		
		int i=0;
		while(r<a.length)
		{
			b[i]=a[r];
			i++;
			r++;
		}
		r=0;
		while(r<n)
		{
			b[i]=a[r];
			i++;
			r++;
		}
		for(int arr:b)
		{
			System.out.print(arr+" ");
		}
		System.out.println();
    }
}
