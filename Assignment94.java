/* J_Richardson_AB_37
 * Assignment -94
find out the area of a circle for ten times,
take pi value from math.pi and 
take r value from math.random and 
solve this problem 10 times.*/

package Assignment06012024;

public class Assignment94 {

	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println("value of the pi = " + pi);

		for (int i = 0; i < 10; i++) {
			double r = Math.random();
			double area = pi * r * r;

			System.out.println("Area of the circle = " + area);

		}
	}
}
