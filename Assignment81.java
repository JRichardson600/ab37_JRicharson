/* J_Richardson_AB_37
 * Assignment -81
Find out number of char and number of digits in below string
Rahul123*/

package Assignment24122023;

public class Assignment81 {

	public static void main(String[] args) {
		String str = "987654321Ab";
		char c1[] = str.toCharArray();
		int countOfNum = 0;
		int countOfChar = 0;

		for (int i = 0; i <= str.length()-1 ; i++) {
			boolean ans = Character.isDigit(c1[i]);
			if (ans == true) {
				countOfNum++;// no of Numbers
			} else {
				countOfChar++;// no of Char
			}

		}

		System.out.println("The no of Digit = " + countOfNum);

		System.out.println("The no of Char = " + countOfChar);

	}
}
