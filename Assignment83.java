/* J_Richardson_AB_37
 * Assignment -83
Check if the String is Palindrome*/

package Assignment06012024;

public class Assignment83 {

	public static void main(String[] args) {
		String str = "radar";
		System.out.println("Original String = " + str);
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char reverse = str.charAt(i);

			rev = rev + reverse;
		}

		System.out.println("Reversed String = " + rev);

		if (rev.matches(str)) {
			System.out.println("Input String is palindrome");
		} else {
			System.out.println("Input String is NOT palindrome");
		}

	}
}
