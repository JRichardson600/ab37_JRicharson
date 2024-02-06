/* J_Richardson_AB_37
 * Assignment -2
 *WAP to create a Class with 2 static and 2 non static methods, 
 *perform add and sub in first two. 
 *Multiply and divide in last two and call in main*/

package Assignment25112023;

public class Assignment10 {

	static void add() {

		int a = 10;
		int b = 30;
		System.out.println("Add = " + (a + b));

	}

	static void sub() {
		int a = 10;
		int b = 30;
		System.out.println("Subtract = " + (b - a));

	}

	void multiply() {
		int a = 10;
		int b = 30;
		System.out.println("Multiply = " + (b * a));

	}

	void divide() {
		int a = 10;
		int b = 40;
		System.out.println("Divide = " + (b / a));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(); // calling static method

		sub(); // calling static method

		Assignment10 a1 = new Assignment10(); // objection creation

		a1.multiply(); // calling non static method

		a1.divide();// calling non static method

	}

}
