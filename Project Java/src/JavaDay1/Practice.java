package JavaDay1;

import java.util.Scanner;

public class Practice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading s=new Overloading();
		s.Addition();
		int a, b, c;
		System.out.println("ENTER YOUR NUMBER");
		Scanner z=new Scanner (System.in);
		
		a=z.nextInt();
		b=z.nextInt();
		c=z.nextInt();
		
		
		if (a>b) {
			System.out.println("MAX NUMBER IS " +a);
		} 		
			if (b>c) {
				System.out.println("MAX NUMBER IS " +b);
			} else {
				System.out.println("MAX NUMBER IS " +c);
			} 
		       if (c>a) {
		    	   System.out.println("C IS GREATER");
		       } else {
		    	   System.out.println("NAME");
		       }
		    	   
	}
		}
	


