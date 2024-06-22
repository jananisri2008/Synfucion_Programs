package numberprograms;

public class SmallestThreeNumber 
{
	public static void main(String[] args) 
	{
		int n1=10,n2=20,n3=30,res,temp;
		temp=n1<n2?n1:n2;
		res=n3<temp?n3:temp;
		System.out.println(res+" smallest");
		
		
	}

}
