/* J_Richardson_AB_37
 * Assignment -74
String = GroTechMinds
Output 1= All capital letters in String a
Output 2= All small letters in String b
and print both the strings"*/

package Assignment24122023;

public class Assignment74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "MaNiSh";

		String a1 = a.replaceAll("[a-z]", "");
		
		String a2 = a.replaceAll("[A-Z]", "");
		
		System.out.println("Only capitals = " + a1);
		
		System.out.println("Only Lowercase = " + a2);


	}
}
