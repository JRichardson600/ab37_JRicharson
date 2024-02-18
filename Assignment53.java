/* J_Richardson_AB_37
 * Assignment -53
Do everything same as Assignment 52 but only with 4 interfaces instead of 2 */

package Assignment09122023;

interface QAZ {

	void mod();

	void divd();

}

interface WSX {

	void rem();

	void quo();

}

interface ZXC {

	void mul();

	void div();

}

interface VBN {

	void add();

	void sub();

}

public class Assignment53 implements ZXC, VBN , QAZ ,WSX {

	public static void main(String[] args) {
		Assignment53 a1 = new Assignment53();

		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.rem();
		a1.divd();
		a1.mod();
		a1.quo();
	}

	public void mul() {
		System.out.println("Multiplication");
	}

	public void div() {
		System.out.println("Diviision");

	}

	public void add() {
		System.out.println("Addition");

	}

	public void sub() {

		System.out.println("Subtraction");
	}

	@Override
	public void rem() {
		// TODO Auto-generated method stub
		System.out.println("Remainder");
	}

	@Override
	public void quo() {
		// TODO Auto-generated method stub
		System.out.println("Quotient");
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		System.out.println("Modulus");
	}

	@Override
	public void divd() {
		// TODO Auto-generated method stub
		System.out.println("Dividend");
	}

}
