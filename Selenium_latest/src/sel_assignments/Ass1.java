package sel_assignments;

public class Ass1 {
	
	public int add(int a, int b)
	{
		int c= a+b;
		System.out.println("addition result "+c);
		return c;
	}
public int sub(int x1,int x2)
{
	int x3= x1-x2;
	System.out.println("subtraction result "+x3);
	return x3;
}
 public int mul (int c1,int c2)
 {
	 int c3= c1*c2;
	 System.out.println("multiplication results "+c3);
	 return c3;
 }
public void div(int b1,int b2)
{
int b4 = b1/b2;
System.out.println("final output " +b4);
}
public static void main(String[] args) {

	Ass1 abc= new Ass1();
	int addresult = abc.add(10, 2);
	int addresult1= abc.add(addresult, 2);
	int subresult= abc.sub(addresult1, 2);
	int multresult = abc.mul(subresult, 2);
	abc.div(multresult, 2);
	
	
}
}
