/* J_Richardson_AB_37
 * Assignment -54
Create child class having relation with Abstract class and
 that abstract class is having relation with 2 different interfaces */

package Assignment10122023;

interface RTY {
	void div();

	void mod();

}

interface QWE  {
	void sub();

	void mul();

}

abstract class ABC implements QWE ,RTY {
	abstract void add();

}

public class Assignment54 extends ABC {

	public static void main(String[] args) {
		Assignment54 a1 = new Assignment54();
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
