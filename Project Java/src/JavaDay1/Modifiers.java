package JavaDay1;

public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Modifiers a=new Modifiers();
a.science();
	}
	
public void math () {
	System.out.println("this is public method of math");
	science();
	
}

private void science() {

System.out.println("this is private method of science");
}






}
