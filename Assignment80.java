/* J_Richardson_AB_37
 * Assignment -80
Take any alphanumeric String and check at which position there is numeric value*/

package Assignment24122023;

public class Assignment80 {

	public static void main(String[] args) {
		String str = "GrotechMinds12345";
		char c1[] = str.toCharArray();

		for (int i = 0; i <= str.length() - 1; i++) {
			boolean ans = Character.isDigit(c1[i]);
			if (ans == true) {
				System.out.println(c1[i] + " It is a digit and index is = " + i);
			} else {
				System.out.println(c1[i] + " It is NOT a digit ");
			}
		}

	}
}
