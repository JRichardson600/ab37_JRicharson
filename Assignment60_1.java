/* J_Richardson_AB_37
 * Assignment -60
WAP to access 4 different access specifiers outside the package by becoming the subclass*/

package Assignment25122023_1;

import Assignment25122023.Assignment60;

public class Assignment60_1 extends Assignment60 {

	public static void main(String[] args) {
		Assignment60_1 a1 = new Assignment60_1();
		a1.add();// only public can be accessed
		//a1.sub()//private cannot be accessed
		a1.mul();// protected be accessed
		//a1.div();// default or package cannot be accessed
	}

}