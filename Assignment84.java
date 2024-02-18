/* J_Richardson_AB_37
 * Assignment -84
Check if 2 given strings are anagram of each other or not*/

package Assignment06012024;

import java.util.Arrays;

public class Assignment84 {

	public static void main(String[] args) {
		String str1 = "3sitaram2";
		String str2 = "ramsita123";

		if (str1.length() != str1.length()) {
			System.out.println("They are not anagram");
		} else {
			char[] c1 = str1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));

			char[] c2 = str2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));

			if (Arrays.equals(c1, c2)) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are NOT anagram");
			}

		}

	}
}
