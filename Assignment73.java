/* J_Richardson_AB_37
 * Assignment -73
WAP for below (You can take your name )
String = "My Name Is Manish"
 Output : M N I M. 
After printing this remove all the spaces from the output and print it"*/

package Assignment24122023;

public class Assignment73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "My Name Is Manish";

		String a1 = a.replaceAll("[a-z]", "");

		System.out.println(a1);

		System.out.println(a1.replaceAll(" ", ""));

	}
}
