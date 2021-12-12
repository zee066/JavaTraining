package JavaDay1;

import java.util.Scanner;

public class Staticnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Staticnonstatic s=new Staticnonstatic();
int profitafterexpenses = s.Subtract();
	System.out.println(profitafterexpenses);
	Addition();
	
	}
	
	//THIS IS NON STATIC METHOD CALLED IN STATIC METHOD with a returning variable(because main is a static method)	
		public int Subtract(){
			int income   = 100000;
			int expenses = 40000;
			int profit   = income-expenses;{
				System.out.println("The Profit is = " +profit);
	return profit;
			}
	
		
	}
		// THIS IS A STATIC METHOD AND CALLED IN A STATIC METHOD
		public static void Addition(){
			int income   = 100000;
			int expenses = 40000;
			int grossprofit   = income+expenses;{
				System.out.println("The GrossProfit is = " +grossprofit);
			}
		}
}