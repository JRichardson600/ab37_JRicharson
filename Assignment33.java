/* J_Richardson_AB_37
 * Assignment -33
WAP to find the Area of Circle , keep pi as static global final , 
create 2 methods 1 having r = 7 and another having r =14*/

package Assignment25112023;

public class Assignment33 {
	final static double pi = 3.14;
	
	static void areaOfCircle() {
		double r=14;
		double area= pi * r * r;
		System.out.println("Area of circle from method = " + area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r=7;
		double area= pi * r * r;
		System.out.println("Area of circle from main method  = " + area);
		areaOfCircle();		
	}
}
