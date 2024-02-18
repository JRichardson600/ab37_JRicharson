/* J_Richardson_AB_37
 * Assignment - 63
Create an array of length =5 of int datatype and fetch its value from scanner class.*/

package Assignment26122023;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the values of the 5 Rollnos");

		int rollNo[] = new int[5];

		for (int i = 0; i < rollNo.length; i++) {

			rollNo[i] = s1.nextInt();

		}
		System.out.println(Arrays.toString(rollNo));

	}

}