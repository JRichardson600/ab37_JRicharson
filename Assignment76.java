/* J_Richardson_AB_37
 * Assignment -76
Create an array of length 5. 
Find out the index of number 41*/

package Assignment24122023;

public class Assignment76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		arr[0]= 21;
		arr[1]= 0;
		arr[2]= 41;
		arr[3]= 22;
		arr[4]= 36;
		
		
		int arrTar = 41;
		

		for (int i = 0; i <= arr.length-1; i++) {

			if (arrTar == arr[i]) {
				System.out.println("Number "+ arrTar +" is present at index = " + i);
				
			} 
		}
	}
}
