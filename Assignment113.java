/* J_Richardson_AB_37
 * Assignment -113
Launch Amazon Sign in page and login with Credentials.*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment113 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIyZW-mo7sgwMVIR2DAx0UiAMjEAAYASAAEgJ8A_D_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9062017%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D3365444807053463266%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("jrichardson5482@gmail.com");// using name - email
		driver.findElement(By.id("continue")).click();// using name - click on the login button

		driver.findElement(By.name("password")).sendKeys("9916455168@Rj");// using id - password
		driver.findElement(By.id("signInSubmit")).click();// using name - click on the login button
	}

}