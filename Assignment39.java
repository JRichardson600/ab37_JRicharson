/* J_Richardson_AB_37
 * Assignment -39
WAP by taking value of age from scanner class and 
if age is greater than equal to 18 then print " i am adult" else print " i am young"*/

package Assignment29112023;

import java.util.Scanner;

public class Assignment39 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the value for age");
		int a = s1.nextInt();

		if (a >= 18) {
			System.out.println("I am adult");
		} else {
			System.out.println("I am still young");
		}

	}

}
