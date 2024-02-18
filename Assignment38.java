/* J_Richardson_AB_37
 * Assignment -38
WAP to find area of triangle by taking values of b and h from scanner class*/


package Assignment29112023;

import java.util.Scanner;

public class Assignment38 {
	
	 


	public static void main(String[] args) {
		 
		Scanner s1 = new Scanner(System.in);
		
		  System.out.println("Enter the value for base");
		  double a = s1.nextDouble();
		   
		  System.out.println("Enter the value for height");
		  double b = s1.nextDouble();
		 
		  
		  System.out.println("Area of traingle  = " + (0.5 * a * b));

	}

}
