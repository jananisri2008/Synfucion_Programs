package numberprograms;

public class LargestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int n1=10,n2=20,n3=15,res,temp;
		/*if(n1>n2 && n1>n3)
			System.out.println(n1+"largest number");
		else if(n2>n3)
			System.out.println(n2+"largest number");
		else
			System.out.println(n3+"largest number");
	*/
		temp=n1>n2?n1:n2;
		res=n3>temp?n3:temp;
		System.out.println(res+" is largest");
	}

}
