/* J_Richardson_AB_37
 * Assignment -68
M1="Software";
M2="Testing";
Output should print as:SoftwareTesting in a vertical way like below
S
o
f
t
w
a
r
e
T
e
s
t
i
n
g*/

package Assignment24122023;

public class Assignment68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m1 = "Software";
		String m2 = "Testing";

		String newStr  = m1.concat(m2);
		System.out.println(m1.concat(m2));
		
		for(int i =0;i<newStr.length();i++) {
			System.out.println(newStr.charAt(i));
		}
	}

}
