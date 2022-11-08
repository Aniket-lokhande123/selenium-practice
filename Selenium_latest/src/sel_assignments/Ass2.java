package sel_assignments;

public class Ass2 {

public int mul(int a, int b) 
{
int c= a*b;
System.out.println("Multiplication result "+c);
return c;
}
public int add(int a1,int a2) 
{
int a3= a1+a2;
System.out.println("addition result "+a3);
return a3;
}
public int sub(int b1, int b2)
{
int b3= b1-b2;
System.out.println("Subtraction result "+b3);
return b3;
}
public void div(int x1, int x2)
{
int x3= x1/x2;
System.out.println("Final result "+x3);
}
	
public static void main(String[] args) 
{
Ass2 pqr = new Ass2();
int mulresult = pqr.mul(10, 2);
int addresult = pqr.add(mulresult, 2);
int subresult = pqr.sub(addresult, 2);
int subresult1 = pqr.sub(subresult, 2);
pqr.div(subresult1, 2);
	
}
}
