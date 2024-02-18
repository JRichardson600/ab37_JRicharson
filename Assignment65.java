/* J_Richardson_AB_37
 * Assignment - 65
Create an array of length 4 & copy its value to another array using iteration*/

package Assignment26122023;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment65 {

	public static void main(String[] args) {

		int rollNo[] = { 36, 45, 26, 46 };

		int rollNo1[] = new int[4];

		for (int i = 0; i < rollNo.length; i++) {

			rollNo1[i] = rollNo[i];

		}
		System.out.println("Original Array = " + Arrays.toString(rollNo));

		System.out.println("Copied Array = " + Arrays.toString(rollNo1));
	}

}