/* J_Richardson_AB_37
 * Assignment -105
WAP for Access Specifier for Class
Create 2 packages 
package 1 having 2 methods one public having main and one default , 
package 2 having 2 methods one public and one default with no main method*/

package Assignment2012024_105;

import Assignment2012024_105_1.Assignment105TeacherManishPublic;

public class Assignment105StudentS1 {// public class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment105StudentS2NotPublic a2 = new Assignment105StudentS2NotPublic();// accessing default/package class-within the package

		Assignment105TeacherManishPublic a1 = new Assignment105TeacherManishPublic();// accessing public class-from diff package

		// Assignment105TeacherManish2NOTpublic a2 = new Assignment105TeacherManish2NOTpublic();// default/package-ouside the package NOT possible
		
	}

}
