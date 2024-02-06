/* J_Richardson_AB_37
 * Assignment -17
 WAP with 4 constructors and 1 IIB*/

package Assignment25112023;

public class Assignment17 {

	{// IIB_1
		System.out.println("From IIB_1");
	}
	
	{// IIB_2
		System.out.println("From IIB_2");
	}

	Assignment17() // constructor_1
	{
		System.out.println("From constructor_1");
	}

	Assignment17(int a) // constructor_2
	{
		System.out.println("From constructor_2_int_a");
	}
	
	Assignment17(String b) // constructor_3
	{
		System.out.println("From constructor_3_String_b");
	}

	Assignment17(double a) // constructor_4
	{
		System.out.println("From constructor_4_double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Assignment17();
		new Assignment17(5);
		new Assignment17("Richard");
		new Assignment17(1.1);
		System.out.println("I am main method");
	}
}
