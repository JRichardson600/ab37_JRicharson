/* J_Richardson_AB_37
 * Assignment -40
WAP a program using
Switch(3) keyword case1:
addition, case2:subtraction, 
case3:multiplication, 
case4:division and break at
 case(3).*/

package Assignment29112023;

import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value of a = ");
		
		int a = s1.nextInt();
		
		System.out.println("Enter the value of a = ");
		
		int b = s1.nextInt();
		
	switch(1)
	{
	case 1:
		addition : System.out.println("Sum = " + (a+b));

		
	case 2:
		subtraction : System.out.println("Subtraction = " + (a-b));
		
	case 3:
		multiplication : System.out.println("Multiplication = " + (a * b));
		break;
		
	case 4:
		division : System.out.println("Product = " + (a / b));
	
	}

	}

}
