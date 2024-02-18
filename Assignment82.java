/* J_Richardson_AB_37
 * Assignment -81
Reverse a String and Print it*/

package Assignment06012024;

public class Assignment82 {

	public static void main(String[] args) {
		String str = "987654321abcd";
		System.out.println("Original String = "+str);
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char reverse = str.charAt(i);
			
			rev=rev+reverse;
		}
		
		System.out.println("Reversed String = "+rev);

	}
}
