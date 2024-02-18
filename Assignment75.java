/* J_Richardson_AB_37
 * Assignment -75
Create an array of length 4 of int data type.
 Find out 41 is present or not in array. 
 Print message in both the cases.*/

package Assignment24122023;

public class Assignment75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 36, 46, 41, 52 };
		int arrTar = 41;

		for (int i = 0; i <= arr.length-1; i++) {

			if (arrTar == arr[i]) {
				System.out.println("Number to be checked = " + arrTar + " is present in a given array ");
				
			} 
		}
	}
}
 