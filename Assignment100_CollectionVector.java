/* J_Richardson_AB_37
 * Assignment -100
WAP on Vector*/


package Assignment2012024;

import java.util.Collections;
import java.util.Vector;

public class Assignment100_CollectionVector {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("Manish");
		v1.add("Richard");
//		v1.add(1);
		v1.add("Ashish");
//		v1.add(null);
//		v1.add(false);
		v1.add("Manish");
		v1.add("Kavan");
		v1.add("Hemanth");
//		v1.add(null);
//		v1.add(null);
		v1.add("Manish");
		v1.add("Manish");
		v1.add("Manish");
		Collections.sort(v1);
		System.out.println(v1);
		
		/* Vector accept index,-TRUE
		 *  accept heterogeneous, -TRUE
		 *  accept duplicate,-TRUE
		 *  dynamic value,-TRUE
		 *  accepts null,-TRUE
		 *  sort-TRUE
		 */
	}

}
