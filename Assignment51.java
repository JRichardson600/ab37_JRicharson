/* J_Richardson_AB_37
 * Assignment -51
Create 1 child class having main method ,
1 abstract class having 1 abstract method and 
1 concrete method and interface having abstract method and 
create relation between child class->Abstract class->Interface */

package Assignment09122023;

interface RTY{
	void mul();
}



abstract class QWE  implements RTY {
	abstract void add();

	void sub() {
		System.out.println("Subtraction");
	}
}

public class Assignment51 extends QWE {

	public static void main(String[] args) {
		Assignment51 a1 = new Assignment51();
		 a1.add();
		 a1.mul();
		 a1.sub();
	}

	
	public void mul() {
		System.out.println("Multiplication");
	}

	
	void add() {
		System.out.println("Addition");
	}

}
