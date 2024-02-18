/* J_Richardson_AB_37
 * Assignment -42
WAP using switch(a) keyword 
case1: addition of b&c, 
case2: subtraction of b&c, 
case3: multiplication of b&C, 
case4: division of b&c. 
Fetch the value of a, b &c from scanner class using nextint() method.
 And print the output individually for all cases.*/

package Assignment03122023;

import java.util.Scanner;

public class Assignment42 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value of a (1-4)");
		int a = s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		System.out.println("Enter the value of c");
		int c = s1.nextInt();
		
	switch(a)
	{
	case 1:
		addition : System.out.println("Sum = " + (b+c));
		break;
		
	case 2:
		subtraction : System.out.println("Subtraction = " + (b-c));
		break;
		
	case 3:
		multiplication : System.out.println("Multiplication = " + (b * c));
		break;
		
	case 4:
		division : System.out.println("Division = " + (b / c));
		break;
	}

	}

}
