/* J_Richardson_AB_37
 * Assignment -47
write a program for hierarchical inheritance and 
create three separate classes(son, daughter, parent) */

package Assignment03122023_2;

public class Daughter extends Parent{ // child/sub class

	static void add() {
		System.out.println("Add");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d1 = new Daughter();
		
		d1.add(); // using the sub-class methods
		
		d1.Subtract(); // using the parent / super-class methods
		
	}

}
 