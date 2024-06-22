package numberprograms;

public class SwapTwoNumber 
{
	public static void main(String[] args)
	{
		int n1=10,n2=20;
		System.out.println("Before Swap");
		System.out.println("a"+n1+" "+"b"+n2);
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		System.out.println("After Swap");
		System.out.println("a"+n1+" "+"b"+n2);
		
	}

}
