/* J_Richardson_AB_37
 * Assignment -50
Create 1 child class and 2 interfaces ( both having 2-2 abstract methods in it)
 and create relation between child class->interface(1st)->interface(2nd) */

package Assignment09122023;

interface DEF{
	void add();
	void sub();
}

interface XYZ extends DEF{
	
	void mul();
	void div();
}

public class Assignment50 implements XYZ{

	public static void main(String[] args) {
		Assignment50 a1 = new Assignment50();
		
		a1.add();
		a1.sub();a1.mul();
		a1.div();
	}

	
	public void add() {
		System.out.println("Addition");
	}

	
	public void sub() {
		System.out.println("Subtraction");
		
	}


	public void mul() {
		System.out.println("Multiplication");
		
	}


	public void div() {
		System.out.println("Division");
		
	}

}
