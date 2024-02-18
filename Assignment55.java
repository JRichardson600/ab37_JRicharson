/* J_Richardson_AB_37
 * Assignment -55
Create child class having relation with abstract class
that abstract class having relation with interface(1st) &
that interface(1st) having relation with another interface(2nd)*/

package Assignment10122023;

interface PQR {
	void div();

	void mod();

}

interface MNO extends PQR {
	void sub();

	void mul();

}

abstract class DEF implements MNO {
	abstract void add();

}

public class Assignment55 extends ABC {

	public static void main(String[] args) {
		Assignment55 a1 = new Assignment55();
		a1.add();
		a1.sub();
		a1.div();
		a1.mul();
		a1.mod();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division");
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		System.out.println("Modulus");
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}

}
