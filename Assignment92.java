/* J_Richardson_AB_37
 * Assignment -92
Upcasting and downcasting Problem 4 as per Diagram during Class*/

package Assignment06012024;

class GreatGrandParentClass3 {
	void div() {
		System.out.println("GreatGrandParentClass3");
	}
}

class GrandParentClass2 extends GreatGrandParentClass3 {
	void mul() {
		System.out.println("GrandParentClass2");
	}
}

class ParentClass2 extends GrandParentClass2 {
	void add() {
		System.out.println("ParentClass2-Addition");
	}
}

public class Assignment92 extends ParentClass2 {
	void sub() {
		System.out.println("ChildClass-Child");
	}

	public static void main(String[] args) {

		GrandParentClass2 g1 = new ParentClass2();// upcasting from the parent to the Grand Parent
		g1.div();// Can access great grand parent class
		g1.mul();// Can access great parent class

		ParentClass2 a1 = (ParentClass2) g1;// downcasting from the Grand parent to the Parent
		a1.div();// Can access great grand parent class
		a1.mul();// Can access grand parent class
		a1.add();// Can access parent class
		// a1.sub();// Cannot access own class

	}
}
