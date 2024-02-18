/* J_Richardson_AB_37
 * Assignment -43
WAP for single level inheritance in a single program and
 make all methods non static(selenium,java,gk) 
 by creating object in child class*/

package Assignment03122023;

class Teacher {
	void selenium() {
		System.out.println("selenium");
	}

	void java() {
		System.out.println("java");
	}

	void gk() {
		System.out.println("gk");
	}
}

public class Student extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.selenium();
		s1.java();
		s1.gk();

	}

}
