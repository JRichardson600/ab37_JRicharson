/* J_Richardson_AB_37
 * Assignment -90
Upcasting and downcasting Problem 2 as per Diagram during Class*/

package Assignment06012024;

class GrandParentClass {
	void mul() {
		System.out.println("GrandParentClass-Multiplication");
	}
}

class ParentClass extends GrandParentClass {
	void add() {
		System.out.println("ParentClass-Addition");
	}
}

public class Assignment90 extends ParentClass { // Assignment90 = ChildClass
	void sub() {
		System.out.println("ChildClass-Subtraction");
	}

	public static void main(String[] args) {
		GrandParentClass g1 = new Assignment90(); // upcasting from child to grandparent

		g1.mul();// Can access grand parent class
		// g1.add();//cannot access parent class
		// g1.sub();//cannot access child class

		Assignment90 a1 = (Assignment90) g1; // downcasting from grandparent to child

		a1.mul();// Can access grand parent class
		a1.add();// Can access parent class
		a1.sub();// Can access own child class

	}

}
