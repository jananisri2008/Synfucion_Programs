package basicsproblems;

public class CreateObject 
{
	int a=10,b=20,c;
	void add()
	{
		c=a+b;
		System.out.println("Addition of two numbers "+a+" "+b+" is "+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction of two numbers "+a+" "+b+" is "+c);
	}
public static void main(String[] args) 
{
	System.out.println("\t\t\tCreate an Object");
	System.out.println("\t\t\t****************");
	CreateObject cobj=new CreateObject();
	cobj.add();
	cobj.sub();
}
}
