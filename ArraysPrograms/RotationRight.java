package ArraysPrograms;
import java.util.*;
public class RotationRight
{
	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5};
	int b[]=new int[a.length];
	int n=2;
	int r=n;
	
	int i=0;
	while(r>0)
	{
		b[i]=a[a.length-r];
		i++;
		r--;
	}
	r=0;
	while(r<a.length-n)
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
