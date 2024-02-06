/* J_Richardson_AB_37
 * Assignment -8
 * Create few constructor and call it in main method*/

package Assignment25112023;

public class Assignment8 {

	Assignment8() {
		int a = 10;
		int b = 20;
		System.out.println("Sum = " + (a + b));
	}

	Assignment8(int a, int b) {
		System.out.println("subtract = " + (a - b));
	}

	Assignment8(double b, double a) {

		System.out.println("multiply = " + (a * b));
	}

	Assignment8(double a, float b) {

		System.out.println("divide = " + (a / b));
	}

	public static void main(String[] args) {

		new Assignment8();

		new Assignment8(20, 10);

		new Assignment8(35.5, 7.1);

		new Assignment8(200.10, 10f);

	}

}