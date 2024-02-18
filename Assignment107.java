/* J_Richardson_AB_37
 * Assignment -107
WAP for return keyword for float , double , string , boolean , using scanner class*/

package Assignment2012024;

import java.util.Scanner;

public class Assignment107 {

	float add(float a, float b) {
		float sum = a + b;
		return sum;

	}

	double sub(double a, double b) {
		double sub1 = a - b;
		return sub1;

	}

	String str(String a) {
		String mul1 = a.concat(" Singh");
		return mul1;

	}

	boolean true_false(boolean a) {
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment107 a1 = new Assignment107();
		Scanner s1 = new Scanner(System.in);

		// Float

		System.out.println("Enter the value of A and B");
		float a = s1.nextFloat();
		float b = s1.nextFloat();

		System.out.println("Return from float method = " + a1.add(a, b));

		// Double

		System.out.println("Enter the value of C and D");
		double c = s1.nextDouble();
		double d = s1.nextDouble();

		System.out.println("Return from double method = " + a1.sub(c, d));

		// String

		System.out.println("Enter the String");
		String e = s1.next();

		System.out.println("Return from String method = " + a1.str(e));

		// Boolean

		System.out.println("Enter the True or false");
		boolean f = s1.nextBoolean();

		System.out.println("Return from boolean method = " + a1.true_false(f));

	}

}
