/* J_Richardson_AB_37
 * Assignment -21
WAP with 3 methods main,static add and static subtract. 
Declare and initialize a and b global variables as non- static in nature and 
then perform addition and subtraction with static methods*/

package Assignment25112023;

public class Assignment21 {
	int a;
	int b;

	static void add() {
		Assignment21 a1 = new Assignment21();
		a1.a = 10;
		a1.b = 20;
		System.out.println("Sum = " + (a1.a + a1.b));
	}

	static void subtract() {
		Assignment21 a2 = new Assignment21();
		a2.a = 100;
		a2.b = 50;
		System.out.println("Subtract = " + (a2.a - a2.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		subtract();
	}
}
