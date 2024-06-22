package ArraysPrograms;

public class Odd_EvenNumbers
{
	public static void main(String[] args) 
	{
		int a[]= {19,27,22,36,56};
		System.out.println("even number");
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("odd nunmber");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
			}

}
