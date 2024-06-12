package package1;

public class Mathoperation {

	public int sum (int a , int b)
	{
	int c= a+b;
	System.out.println ("Sum is" +c);
	return c;
	}
	public int sub (int a , int b)
	{
	int c= a-b;
	System.out.println ("Sub is" +c);
	return c;
	}

	public int multi (int a , int b)
	{
	int c= a*b;
	System.out.println ("Multi is" +c);
	return c;
	}
	public void Div(int a,int b)
	{
	int c= a/b;
	System.out.println ("Div is" +c);

	}
	public static void main (String[] args)
	{
	Mathoperation obj= new Mathoperation();
	 int multi =  obj.multi(10, 2);
	 int Sub1 = obj.sub(multi, 2);
	 int sum  = obj. sum(Sub1 , 2);
	 int sub2 = obj. sub(sum ,2);
	 obj.Div(sub2, 2);

	}

}
