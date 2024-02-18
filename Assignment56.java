/* J_Richardson_AB_37
 * Assignment -56
Create child class having relation with interface(1st)
1st interface having relation with 2nd interface
2nd interface having relation with 3rd interface*/

package Assignment10122023;

interface STU {
	void add();

	void rem();

}

interface CBA extends STU {
	void div();

	void mod();

}

interface XYZ extends CBA {
	void sub();

	void mul();

}

public class Assignment56 implements XYZ {

	public static void main(String[] args) {
		Assignment56 a1 = new Assignment56();
		a1.add();
		a1.sub();
		a1.div();
		a1.mul();
		a1.mod();
		a1.rem();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Subtraction");
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
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}

	@Override
	public void rem() {
		// TODO Auto-generated method stub
		System.out.println("Remainder");
	}

}
