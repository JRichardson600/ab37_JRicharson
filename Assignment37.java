/* J_Richardson_AB_37
 * Assignment -37
WAP to do addition, subtraction,multiplication, 
division by using scanner class and  a and b as global variables*/

package Assignment29112023;

import java.util.Scanner;

public class Assignment37 {

	static int a;

	static int b;

	static Scanner s1 = new Scanner(System.in);

	static void addition() {
		Assignment37 a1 = new Assignment37();
		
		System.out.println("Addition");
		System.out.println("Enter the value for a");
		a = s1.nextInt();

		System.out.println("Enter the value for b");
		b = s1.nextInt();

		System.out.println("Sum = " + (a + b));
	}

	static void subtraction() {
		System.out.println("Subtraction");
		System.out.println("Enter the value for a");
		a = s1.nextInt();

		System.out.println("Enter the value for b");
		b = s1.nextInt();

		System.out.println("Subtract = " + (a - b));
	}

	static void multiplication() {
		System.out.println("Multiplication");
		System.out.println("Enter the value for a");
		a = s1.nextInt();

		System.out.println("Enter the value for b");
		b = s1.nextInt();

		System.out.println("Multiply = " + (a * b));
	}

	static void division() {
		System.out.println("Division");
		System.out.println("Enter the value for a");
		a = s1.nextInt();

		System.out.println("Enter the value for b");
		b = s1.nextInt();

		System.out.println("Divide = " + (a / b));
	}

	public static void main(String[] args) {

		addition();
		subtraction();
		multiplication();
		division();
	}

}
