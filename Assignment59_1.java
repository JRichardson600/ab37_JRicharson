/* J_Richardson_AB_37
 * Assignment -59
WAP to access 4 different access specifiers outside the package without becoming the subclass*/

package Assignment25122023;

import Assignment23122023.Assignment59;

public class Assignment59_1 {

	public static void main(String[] args) {
		Assignment59 a1 = new Assignment59();
		a1.add();// only public can be accessed
		// a1.sub();//private cannot be accessed
		// a1.div();// protected cannot be accessed
		// a1.mul();// default or package cannot be accessed

	}
}