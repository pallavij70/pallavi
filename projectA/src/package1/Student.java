package package1;

public class Student
{
	int Age,Rollnumber;
	public void display1()
	{
	System.out.println("Welcome to all of you");
	}

	public void display2()
	{
	System.out.println("Automation is very easy");
	}

	public static void main(String[] args)
	{
	Student ab= new Student();
	ab.display1();
	ab.display2();
	ab.Age=35;
	ab.Rollnumber=43;
	System.out.println("Student Age is" +  ab.Age);
	System.out.println("Student Rollnumber is" + ab.Rollnumber);
	}

}
