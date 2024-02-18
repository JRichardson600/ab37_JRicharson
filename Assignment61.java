/* J_Richardson_AB_37
 * Assignment -61
WAP to handle below 2 exceptions by using 2 catch blocks
Scanner s1= new Scanner
int c = 1/0;
int a = s1.nextint();*/

package Assignment25122023_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	public static void main(String[] args) {

		try {
			int c = 1 / 0;
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of int");
			int a = s1.nextInt();
		} catch (ArithmeticException a1) {
			System.out.println("Exception is handeled ArithmeticException");

		} catch (InputMismatchException a3) {
			System.out.println("Exception is handeled InputMismatchException");

		}

	}

}