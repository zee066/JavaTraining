package JavaDay1;

public class JavaLesson1 {
int A=5; //A is a global variable 
	int d=10; //instance variable (instance variable is part of a class and we can't access without an object) because written outside the method which (main)
	static double b=20.5; // static variable (b is a variable and double is data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			boolean c= true; // local variable which is written inside the block or method
	JavaLesson1 s=new JavaLesson1();
	System.out.println(s.d+" "+b+" "+c);
	
	}

 }

