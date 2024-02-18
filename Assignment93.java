/* J_Richardson_AB_37
 * Assignment -93
Upcasting and downcasting Problem 5 as per Diagram during Class*/

package Assignment06012024;

class GreatGrandParentClass4 {
	void div() {
		System.out.println("GreatGrandParentClass3");
	}
}

class GrandParentClass4 extends GreatGrandParentClass4 {
	void mul() {
		System.out.println("GrandParentClass2");
	}
}

class ParentClass4 extends GrandParentClass4 {
	void add() {
		System.out.println("ParentClass4-Addition");
	}
}

public class Assignment93 extends ParentClass4 {
	void sub() {
		System.out.println("ChildClass-Child");
	}

	public static void main(String[] args) {

		GrandParentClass2 g1 = new ParentClass2();// upcasting from the parent to the Grand Parent
		g1.div();// Can access great grand parent class
		g1.mul();// Can access great parent class

		ParentClass4 a1 = new Assignment93();// upcasting from the child to the Parent
		ParentClass4 b1 = (ParentClass4) a1;// downcasting from the parent to the child
		b1.div();// Can access great grand parent class
		b1.mul();// Can access grand parent class
		b1.add();// Can access parent class
		// b1.sub();// Cannot access own class

	}
}
