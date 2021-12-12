/*Topic: Methods, is collection or block of code.*/


package JavaDay1;

import javax.security.auth.Subject;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax();
		int tax;
	}		
/*    Profit();
    Subtraction();
  int profitbeforetax =  Monthly(7000,5000, "June");
  { System.out.println(profitbeforetax);}
	}

/*	public static void Profit() {
		int income= 1000;
		int expences=500;
		int profit=(income-expences);
		System.out.println(profit);
	}
	/*public static void Subtraction() {
		int income= 1000;
		int expences=500;
		int profit=(income-expences);
		System.out.println(profit);
	}
	/*public static int Monthly(int income, int expences,String month) {
		int profit=income-expences;
		System.out.println("this is the profit for "+month+"="+profit);
		return profit;
	}*/
		public static int Tax() {
			int salbeforetax= 10000;
			int salaftertax = 8500;	
			int perc = 100;
			int tax = (salbeforetax - salaftertax);
			System.out.println("Tax is = " +tax);
			int taxpercentage= (tax/salbeforetax) * perc;
			System.out.println("Tax is = " +taxpercentage );
		return tax*100/salbeforetax;
		
		}
	}
	
	
	

