package ArraysPrograms;

public class RemoveDuplicateElement 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,2,5,3,6};
		boolean isU;
		for(int i=0;i<a.length;i++)
		{
			isU=true;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j && a[i]==a[j])
				{
					isU=false;
					break;
				}
		     }
			if(isU)
			{
				System.out.print(a[i]+" ");
	        }
		}
    }
}