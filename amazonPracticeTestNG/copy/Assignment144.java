/* J_Richardson_AB_37
 * Assignment -144
write testNG classes  for the following 
1.login to amazon 
2.search for a shoe 
3.logout*/

//1.Login>>Search>>Shoes>>Logout

package amazonPracticeTestNG.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment144 extends Launch_quit {

	@Test
	public void login_Search_logout() throws InterruptedException {

		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoes");

		WebElement search_btn = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(1000);
		search_btn.click();
	}

}
