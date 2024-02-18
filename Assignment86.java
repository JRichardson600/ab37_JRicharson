/* J_Richardson_AB_37
 * Assignment -86
Convert Weight from int to double and from double to int*/

package Assignment06012024;

public class Assignment86 {

	public static void main(String[] args) {
		int weight = 75;
		double myWeight = weight;// implicit - int->double

		System.out.println(myWeight);

		double myWeight1 = 75.26;
		int yourWeight = (int) myWeight1;// explicit - double->int
		System.out.println(yourWeight);
	}
}
