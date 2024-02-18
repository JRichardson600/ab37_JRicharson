/* J_Richardson_AB_37
 * Assignment - 64
Create an array of length 3 having String datatype and 
print it without sorting. 
Now Sort the array and print its value after sorting.
Use toSting function to print the array*/

package Assignment26122023;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment64 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the values of the 3 names");

		String rollNo[] = new String[3];

		for (int i = 0; i < rollNo.length; i++) {

			rollNo[i] = s1.next();

		}
		System.out.println("Before sorting = " + Arrays.toString(rollNo));

		Arrays.sort(rollNo);

		System.out.println("After sorting = " + Arrays.toString(rollNo));
	}

}