/* J_Richardson_AB_37
 * Assignment -57
Create a class with 4 different methods other than main method 
with 4 different access specifiers and try to access them within class*/

package Assignment23122023;

public class Assignment57 {
	
	private void add() {
		System.out.println("This is addition");
	}

	public void sub() {
		System.out.println("This is subtraction");
	}

	protected void mul() {
		System.out.println("This is multiplication");
	}

	void div() {
		System.out.println("This is division");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment57 a1 = new Assignment57();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

}
