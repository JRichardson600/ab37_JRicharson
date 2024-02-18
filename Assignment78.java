/* J_Richardson_AB_37
 * Assignment -78
WAP to check if 2 arrays are equals to each other for int data type*/

package Assignment24122023;

import java.util.Arrays;

public class Assignment78 {

	public static void main(String[] args) {
		int ip[] = { 34, 56, 57, 75 };

		int ip1[] = { 34, 56, 57, 76 };

		if (Arrays.equals(ip, ip1)) {
			System.out.println("Both the arrays are matching");
		} else {
			System.out.println("Both the arrays are NOT matching");
		}

	}
}
