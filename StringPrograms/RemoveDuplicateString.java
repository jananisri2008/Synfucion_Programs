package StringPrograms;

public class RemoveDuplicateString 
{
	public static void main(String[] args) 
		{
			String[] a= {"apple","grapes","apple","grapes","mango"};
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


