/* J_Richardson_AB_37
 * Assignment -52
Create child class and 2 interfaces and 
create relation of child class with interface(1st) and 
relation of child class with interface(2nd) and achieve multiple level inheritance */

package Assignment09122023;

interface FGH {

	void mul();

	void div();

}

interface ASD {

	void add();

	void sub();

}

public class Assignment52 implements ASD, FGH {

	public static void main(String[] args) {
		Assignment52 a1 = new Assignment52();

		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
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

}
