/* J_Richardson_AB_37
 * Assignment -3
 WAP where in a class, there are 5 methods(2 static, 3non static) with same name....
 first method argument is int a,
  second method argument is double a,
  third method argument is char a, 
  fourth method argument is boolean a and 
  fifth method argument is String a*/

package Assignment25112023;

public class Assignment11 {

	static void add(int a) {
		System.out.println(a);
	}
	
	static void add(double a) {
		System.out.println(a);
	}
	
	void add(char a) {
		System.out.println(a);
	}
	
	void add(boolean a) {
		System.out.println(a);
	}
	
	void add(String a) {
		System.out.println(a);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(35);
		
		add(35.75);
		
		Assignment11 a1 = new Assignment11();
		
		a1.add("z");
		
		a1.add(true);
		
		a1.add("Richard");
		
		

	}

}
