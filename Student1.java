/* J_Richardson_AB_37
 * Assignment -44
WAP for single level inheritance 
where gk method(child) is static and 
parent(selenium and java) are non static.*/

package Assignment03122023;

class Teacher1 {// parent
	void selenium() { // non static methods
		System.out.println("Selenium");
	}

	void java() {// non static methods
		System.out.println("Java");
	}

}

public class Student1 extends Teacher1 { // Single level Inheritance

	static void gk() {// child
		System.out.println("General Knowledge");
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.selenium();// parent methods
		s1.java();// parent methods
		gk();// directly calling
	}

}
