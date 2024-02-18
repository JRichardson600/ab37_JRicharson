/* J_Richardson_AB_37
 * Assignment -45
WAP for multilevel inheritance in a single program and
make all the methods are non static*/

package Assignment03122023;

class Three { //grand parent class
	void subtract() {
		System.out.println("Subtract");
	}
}

class Two extends Three{ //super class/parent class extends grand parent class

	void add() {
		System.out.println("Add");
	}
}

public class One extends Two{ //sub class/child class extends parent class

	public static void main(String[] args) {
		
		One O1 = new  One();
		O1.add(); // from super class/parent class
		O1.subtract();// from grand parent class
	}

}
