/* J_Richardson_AB_37
 * Assignment -98
WAP on LinkedList*/

package Assignment2012024;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Assignment98_CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList m1 = new LinkedList();
		m1.add("Manish");
		m1.add("Richard");
		m1.add("Hemanth");
		m1.add("Ashish");
		m1.add("Kavan");

//		m1.add(null);
//		m1.add(false);
		m1.add("Manish");
//		m1.add(33);
//		m1.add('k');
//		m1.add('c');
//		m1.add(null);
//		m1.add(null);
		m1.add("Manish");
		m1.add("Manish");
		m1.add("Manish");

		Collections.sort(m1);
		
		System.out.println(m1);
		
		/* LinkedList accept index,-TRUE
		 *  accept heterogeneous, -TRUE
		 *  accept duplicate,-TRUE
		 *  dynamic value,-TRUE
		 *  accepts null,-TRUE
		 *  sort-TRUE
		 */
	}

}
