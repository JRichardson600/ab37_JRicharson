/* J_Richardson_AB_37
 * Assignment -36
WAP to do addition, subtraction,multiplication, division
 by using scanner class and  a and b as local variables*/

package Assignment29112023;

import java.util.Scanner;

public class Assignment36 {

	static void addition() {
		System.out.println("Addition");

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the value for a");
		int a = s1.nextInt();

		System.out.println("Enter the value for b");
		int b = s1.nextInt();

		System.out.println("Sum = " + (a + b));
	}

	static void subtraction() {
		System.out.println("Subtraction");

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the value for a");
		int a = s1.nextInt();

		System.out.println("Enter the value for b");
		int b = s1.nextInt();

		System.out.println("Subtract = " + (a - b));
	}

	static void multiplication() {
		System.out.println("Multiplication");
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value for a");
		int a = s1.nextInt();

		System.out.println("Enter the value for b");
		int b = s1.nextInt();

		System.out.println("Multiply = " + (a * b));
	}

	static void division() {
		System.out.println("Division");
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value for a");
		int a = s1.nextInt();

		System.out.println("Enter the value for b");
		int b = s1.nextInt();

		System.out.println("Divide = " + (a / b));
	}

	public static void main(String[] args) {
		

		addition();
		subtraction();
		multiplication();
		division();
	}

}
