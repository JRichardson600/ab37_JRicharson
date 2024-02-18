/* J_Richardson_AB_37
 * Assignment -48
Create a class and create two concrete methods inside a class(static add, non static sub),
create abstract class and create two abstract methods (multiplication, division), 
create two concrete methods inside main method */

package Assignment09122023;

class PQR { // concrete class
	static void add() { // static method
		System.out.println("Addition");
	}

	void sub() { // non static method
		System.out.println("Subtraction");
	}
}

abstract class ABC extends PQR { // abstract class

	abstract void mul(); // abstract method

	abstract void div(); // abstract method

}

public class Assignment48 extends ABC { // child class

	static void printName() {
		System.out.println("Richard");
	}

	void displayAge() {
		System.out.println(28);
	}
	
	
	public static void main(String[] args) {
		Assignment48 a1 = new Assignment48();
		
		printName(); //calling the static method within the class 
		a1.displayAge(); //calling the non static method within the class
		a1.mul(); //calling the abstract method from the parent class 
		a1.div(); //calling the abstract method from the parent class
		add(); //calling the static method from the parent class
		a1.sub(); //calling the non static method from the parent class
	}

	void mul() { //method overriding or implementing the abstract methods

		System.out.println("Multiplication");
	}

	void div() { //method overriding or implementing the abstract methods

		System.out.println("Division");
	}

}
