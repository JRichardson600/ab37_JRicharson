/* J_Richardson_AB_37
 * Assignment -62
WAP by using throw keyword
if the age of a person is > 18 then allow him to access www.google.com else throw an ArithmeticException*/

package Assignment26122023;

import java.util.Scanner;

public class Assignment62 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the age of the user");
		int age = s1.nextInt();
		if (age > 18) {
			System.out.println("You can access Google.com");
		} else {
			throw new ArithmeticException("You Cannot access Google.com");
		}
	}

}