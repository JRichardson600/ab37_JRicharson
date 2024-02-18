/* J_Richardson_AB_37
 * Assignment -91
Upcasting and downcasting Problem 3 as per Diagram during Class*/

package Assignment06012024;

class GrandParentClass1 {
	void mul() {
		System.out.println("GrandParentClass1-Multiplication");
	}
}

class ParentClass1 extends GrandParentClass1 {
	void add() {
		System.out.println("ParentClass1-Addition");
	}
}

public class Assignment91 extends ParentClass1 { // Assignment91 = ChildClass
	void sub() {
		System.out.println("ChildClass-Subtraction");
	}

	public static void main(String[] args) {
		ParentClass1 g1 = new Assignment91();// upcasting from child to parent
		g1.mul();// Can access grand parent class
		g1.add();// Can access parent class
		// g1.sub();//cannot access child class
		
		Assignment91 a1 = (Assignment91) g1;// downcasting from parent to child
		a1.sub();// Can access own child class
		a1.add();// Can access parent class
		a1.mul();// Can access grand parent class
	}

}
