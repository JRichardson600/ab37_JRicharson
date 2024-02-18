/* J_Richardson_AB_37
 * Assignment -88
Convert Byte into Double and Double into int*/

package Assignment06012024;

public class Assignment88 {

	public static void main(String[] args) {
		byte age = 127;
		double myAge = age;// implicit - byte->double

		System.out.println(myAge);

		double yourAge = 136.25;
		int OurAge = (int) yourAge;// implicit - double->int

		System.out.println(OurAge);

	}
}
