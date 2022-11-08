package sel_assignments;

public class Student {

	int roll_no;
	int age;


public void display1() 
{
System.out.println("Welcome to all of you");	
}

public void display2() 
{
System.out.println("Automation is very easy");
}

public static void main(String[] args) {
	
	Student abc= new Student();
	abc.display1();
	abc.display2();
	abc.roll_no= 12;
	System.out.println(abc.roll_no);
	abc.age=50;
	System.out.println(abc.age);
}

}