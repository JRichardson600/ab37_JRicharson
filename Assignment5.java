/* J_Richardson_AB_37
 * Assignment -5
 * Write a non static method and call it inside the main method*/

package Assignment25112023;

public class Assignment5 {
	
	 void add() {
		int a=10;
		int b=20;
		System.out.println("Sum = " + (a+b));
	}
	
	

	public static void main(String[] args) {
		
		Assignment5 a1 = new Assignment5();
		a1.add();
		

	}

}