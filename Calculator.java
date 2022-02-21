package week1.day2;

public class Calculator {
 // addition
	
	public void add() {
	int a=4;
	int b=3;
	int sum=a+b;
	System.out.println("Add two numbers:"+sum);
	}
	 // substraction

	public void sub() {
		int c=9;
		int d=2;
		int sub=c-d;
		System.out.println("Substract two numbers:"+sub);
	}
	 // multiplication

	public void mut() {
		short e=11;
		int f=7;
		long mut=e*f;
		System.out.println("multiplying two numbers:"+mut);
	}
	 // division

	public void div() {
		short g=105;
		short h=15;
		int div=g/h;
		System.out.println("dividing two numbers:" +div);
	}
	public static void main(String[] args) {
		Calculator l=new Calculator();
		
		l.add();
		l.sub();
		l.mut();
		l.div();

	}

}
