package JavaDay1;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A s=new A();
int actualprofit=Social(4000, 2500, "jan");	
	System.out.println("Actual Profit is = " +actualprofit);
	
	}
	public static int Social(int income, int expense, String month) { // Method with arguments and returning value
	                                                                  // This Method is outside the main Method
		int profit = income - expense;
		System.out.println("Profit is = " + month +profit);
		return profit;
		
	
	}  
public A() {// THIS IS THE CONSTRUCTOR OF THE CLASS
	System.out.println("print this");
}

}
