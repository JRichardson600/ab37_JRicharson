/* J_Richardson_AB_37
 * Assignment -20
 WAP with 3 methods main,static add and static subtract.
 Declare a and b as static global variables and
 initialize then in each method and perform addition and subtraction*/

package Assignment25112023;

public class Assignment20 {
	static int a;
	static int b;

	static void add() {
		a = 10;
		b = 20;
		System.out.println("Sum = " + (a + b));
	}

	static void subtract() {
		a = 30;
		b = 40;
		System.out.println("Subtract = " + (b - a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		subtract();
	}
}
