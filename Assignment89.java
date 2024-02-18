/* J_Richardson_AB_37
 * Assignment -89
Convert int to Double and double to byte*/

package Assignment06012024;

public class Assignment89 {

	public static void main(String[] args) {
		int age = 32767;
		double myAge = age;// implicit - int->double

		System.out.println(myAge);

		
		double yourAge = 79;//54354-82-3543123.32
		byte OurAge = (byte) yourAge;// implicit - double->byte

		System.out.println(OurAge);

	}
}
