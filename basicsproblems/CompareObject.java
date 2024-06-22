package basicsproblems;

public class CompareObject 
{
	public static void main(String[] args)
	{
		System.out.println("\t\t\tCompare Two Objects");
		System.out.println("\t\t\t*******************");
		
		Integer i=new Integer(200);
		Double d=new Double(200);
		
		System.out.println("Compare the integer value "+i.equals(i));
		System.out.println("Compare the decimal value "+d.equals(d));
		System.out.println("compare the integer to decimal value "+i.equals(d));
		
	}

}
