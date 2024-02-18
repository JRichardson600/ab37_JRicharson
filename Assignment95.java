/* J_Richardson_AB_37
 * Assignment -95
WAP to update the value of private variable username = "abc@grotechmind.com" 
to something else using getter and setter*/

package Assignment2012024;

class Amazon {
	private String Username = "abc@grotechmind.com";

	public String getUsername() // this is getter method
	{
		return Username;// fetched the value

	}

	public void setUsername(String Username)// setter method
	{
		this.Username = Username;// updating the value

	}

}

public class Assignment95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a1 = new Amazon();

		a1.setUsername("richardson5482@gmail.com");// updating the value
		a1.getUsername();
		System.out.println(a1.getUsername());// printing the updated value
	}

}
