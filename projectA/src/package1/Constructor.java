package package1;

public class Constructor 
{
public Constructor() 
{
	// TODO Auto-generated constructor stub
	
	System.out.println("Default parameterized Constructor");
}

public Constructor(int a) 
{
	// TODO Auto-generated constructor stub
	
	System.out.println("single parameterized Constructor");
}

public Constructor( int a, int b) 
{
	// TODO Auto-generated constructor stub
	
	System.out.println("Double parameterized Constructor");

}

public Constructor( int a, int b, int c) 
{
	// TODO Auto-generated constructor stub
	
	System.out.println("three parameterized Constructor");
}
public static void main(String[] args)
{
	Constructor obj1= new Constructor (1,2,3);
	Constructor obj2= new Constructor ();
	Constructor obj3= new Constructor (1);
	Constructor obj4= new Constructor (1,2);
	
}	
}
