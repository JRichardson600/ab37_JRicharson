/* J_Richardson_AB_37
 * Assignment - 66
Create an array of length 4 of int data type and
find out average of those numbers and remainder of those*/

package Assignment26122023;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) {

		int rollNo[] = { 36, 43, 21, 47 };

		int sum = 0;

		for (int i = 0; i < rollNo.length; i++) {

			sum = sum + rollNo[i];

		}
		System.out.println("sum = " + sum);
		double avg = sum / 4;

		int rem = sum % 4;
		System.out.println("Average  = " + avg);
		System.out.println("Remainder  = " + rem);
	}

}