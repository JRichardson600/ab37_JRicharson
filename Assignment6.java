/* J_Richardson_AB_37
 * Assignment -6
 * Write many non static method and call it inside the main method*/

package Assignment25112023;

public class Assignment6 {

	void add() {
		int a = 10;
		int b = 20;
		System.out.println("Sum = " + (a + b));
	}

	void subtract() {
		int a = 10;
		int b = 20;
		System.out.println("subtract = " + (a - b));
	}

	void multiply() {
		int a = 10;
		int b = 20;
		System.out.println("multiply = " + (a * b));
	}

	void divide() {
		int a = 10;
		int b = 20;
		System.out.println("divide = " + (b / a));
	}

	public static void main(String[] args) {

		Assignment6 a1 = new Assignment6();
		a1.add();
		a1.subtract();
		a1.multiply();
		a1.divide();

	}

}