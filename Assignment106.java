/* J_Richardson_AB_37
 * Assignment -106
WAP for return keyword for int and double*/

package Assignment2012024;

public class Assignment106 {

	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	double subtract(double a, double b) {
		double sub = a - b;
		return sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment106 r1 = new Assignment106();
		System.out.println(r1.add(5, 6));//return int data type

		System.out.println(r1.subtract(10.562, 5.2323));//return double data type
	}

}
