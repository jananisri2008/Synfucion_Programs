package ArraysPrograms;

public class Ascending_DesendingOrder
{
	public static void main(String[] args) 
	{
		int a[]= {17,12,10,14,18};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])/*a[j]>a[i]*/
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+",");
		}
		
	}

}
