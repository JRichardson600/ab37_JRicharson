/* J_Richardson_AB_37
 * Assignment -47
write a program for hierarchical inheritance and 
create three separate classes(son, daughter, parent) */

package Assignment03122023_2;

public class Son extends Parent { // child/sub class

	void Multiply() {
		System.out.println("Multiply");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();

		s1.Multiply(); // using the sub-class methods

		s1.Subtract(); // using the parent / super-class methods
	}

}
