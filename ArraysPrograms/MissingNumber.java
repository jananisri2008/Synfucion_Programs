package ArraysPrograms;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5,7};
		int n=a.length+1;
		int form=n*(n+1)/2;
		int sum=0;
		for(int num:a)
		{
			sum+=num;
		}
		int miss=form-sum;
		System.out.println(miss);
	}

}
