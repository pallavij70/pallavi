package package1;

public class Mathoperation1
{
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
	int sum1 = obj. sum (10 , 2);
	int sum2= obj. sum (sum1 ,2);
	int sub= obj. sub (sum2 ,2);
	int multi=  obj.multi(sub, 2);
	obj.Div (multi, 2);


	}


}
