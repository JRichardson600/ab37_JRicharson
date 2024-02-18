/* J_Richardson_AB_37
 * Assignment -77
WAP to check if 2 arrays are equals to each other for String data type*/

package Assignment24122023;

import java.util.Arrays;

public class Assignment77 {

	public static void main(String[] args) {
		String name[] = { "Suraj", "Madan", "Sushmita" };

		String name1[] = { "Suraj", "Madan", "Sushmita" };

		if (Arrays.equals(name, name1)) {
			System.out.println("Both the arrays are matching");
		} else {
			System.out.println("Both the arrays are NOT matching");
		}

	}
}