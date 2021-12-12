package JavaDay1;

public class Overloading {
int global=6;
private int a;
private int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// METHOD OVERLOADING
	    // BELOW ARE THE EXAMPLES OF METHODS WITH SAME NAME BUT SLIGHT DIFFERENCE 	
	   // PUBLIC ACCESS MODIFIERS CAN BE ACCESS ANYWHERE WITHIN THE CLASS AND OUTSIDE THE CLASS ALSO OUT SIDE THE PACKAGE
	   // PRIVATE ACCESS MODIFIERS CAN NOT BE ACCESSIBLE ANYWHERE EXCEPT WITHIN THE CLASS
		
 Overloading s=new Overloading();
 
s.addition(12, 130);
s.addition(); 
s.setA(8);	
int variablevalue = s.getA();
System.out.println(variablevalue);
s.setB(14);
int value = s.getB();
System.out.println(value);}

private void addition() {
	
int global=12;{
System.out.println(this.global);
}
}
public static void Addition() {	
  }
 
public static void addition (int a, int b) {
System.out.println("the values are " +a +" = " +b);
    }

public static void addition (int a, String b) {

}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}


}