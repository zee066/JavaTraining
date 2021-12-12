package Java_oops;

public class Exceptions implements Interface  {

	 public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Exceptions l=new Exceptions();
l.java();

		 
int d=6;
try {
int k=d/0;}
catch (Exception e) {
System.out.println("we can't divid by zero");
		}
finally {
	int a=50;
	int b=5;
	int c=a/b;
	System.out.println("Finally output = "+c);
}
	}

	@Override
	public void java() throws InterruptedException {
	int k=10;// TODO Auto-generated method stub
	int m=0;
	
	int result = k/m;
	System.out.println("Result = "+result);
	}

	@Override
	public void html() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void group() {
		// TODO Auto-generated method stub
		
	}
}
