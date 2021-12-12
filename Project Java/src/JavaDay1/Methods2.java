package JavaDay1;

import java.util.Scanner;

public class Methods2 extends Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Creating method with example*/
Methods2 ob=new Methods2();
ob.Tax();
int salaryaftertax=Monthly();
System.out.println(salaryaftertax);
	}	
	
	
public static void Subtract(){
	int income   = 100000;
	int expenses = 40000;
	int profit   = income-expenses;{
		System.out.println("The Profit is = " +profit);
	}
		}	
   //WE CREATED A METHOD WITHOUT ARGUMENTS//

public static void Addition() {
	
	int cost = 44000;
	int profit = 5000;
	int price = cost + profit; {
		System.out.println("Actual Price is = " +price);
	}
}

public static void New() {
	Scanner obj=new Scanner(System.in);
	int cost;
	int profit;
	
	cost=obj.nextInt();
	profit=obj.nextInt();
	int price = cost + profit;{
	System.out.println( "THE PRICE IS =" + price );
	}	
}


// WE CREATED METHOD WITH ARGUMENTS WHERE WE DECLARE VARIABLES
/*public static void Monthly(int Grosssalary, int tax, String month) {
	int Actualsalary = Grosssalary - tax;
	System.out.println("Actual Salary for the month of " +month +"=" +Actualsalary);

}*/
// CREATING A METHOD WITH RETURNING TYPE
public static int Monthly(){
	int Grosssalary;
	int tax;
	String month;
	Scanner s=new Scanner(System.in);
	Grosssalary=s.nextInt();
	tax=s.nextInt();
	month=s.next();
	int Actualsalary = Grosssalary - tax;
	System.out.println("Actual Salary for the month of " +month +" = " +Actualsalary);
   return Actualsalary;
}
}
