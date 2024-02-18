/* J_Richardson_AB_37
 * Assignment -49
Create a class and in this create interface as Amazon with login and 
logout methods also create child class and create relation between them */

package Assignment09122023;

interface Amazon {
	void login();

	void logout();
}

public class Assignment49 implements Amazon {

	public static void main(String[] args) {
		Assignment49 a1 = new Assignment49();
		a1.login();
		a1.logout();
	}

	public void login() { // Implementing abstract methods
		System.out.println("Login");
	}

	public void logout() {// Implementing abstract methods
		System.out.println("Logout");

	}

}
