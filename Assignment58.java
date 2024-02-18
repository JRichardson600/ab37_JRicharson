/* J_Richardson_AB_37
 * Assignment -58
WAP to access 4 different access specifiers within the package*/

package Assignment23122023;

public class Assignment58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment58_1 a1 = new Assignment58_1();

		a1.add();// public
		// a1.sub();//private cannot be accessed
		a1.div();// protected
		a1.mul();// default or package

	}
}