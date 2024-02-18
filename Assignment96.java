/* J_Richardson_AB_37
 * Assignment -96
WAP to use getter and setter with int, char, boolean, string, float, double */

package Assignment2012024;

class Amazon1 {

	// Int

	private int num = 36;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// Char

	private char ch = 'a';

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	// boolean

	private boolean bln = true;

	public boolean isBln() {
		return bln;
	}

	public void setBln(boolean bln) {
		this.bln = bln;
	}

	// String

	private String Username = "abc@grotechmind.com";

	public String getUsername() // this is getter method
	{
		return Username;// fetched the value

	}

	public void setUsername(String Username)// setter method
	{
		this.Username = Username;// updating the value

	}

	// Float

	private float num1 = 35545631;

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	// double

	private double num2 = 45.4323132;

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

}

public class Assignment96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon1 a1 = new Amazon1();

		a1.setNum(45);// updating the value for Int
		System.out.println("Updated value of int = " + a1.getNum());// printing the updated value for Int

		a1.setCh('z');// updating the value for char
		System.out.println("Updated value of char = " + a1.getCh());// printing the updated value for char

		a1.setBln(false);// updating the value for boolean
		System.out.println("Updated value of boolean = " + a1.isBln());// printing the updated value for boolean

		a1.setUsername("jrichardson5482.com");// updating the value for string
		System.out.println("Updated value of String = " + a1.getUsername());// printing the updated value for string

		a1.setNum1(6531231);// updating the value for float
		System.out.println("Updated value of float = " + a1.getNum1());// printing the updated value for float

		a1.setNum2(45.6131323);// updating the value for double
		System.out.println("Updated value of double = " + a1.getNum2());// printing the updated value for double
	}

}
