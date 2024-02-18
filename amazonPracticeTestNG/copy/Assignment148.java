/* J_Richardson_AB_37
 * Assignment -148
write testNG classes for the following 
1.login to amazon 
2.search for a pen 
3.select anyone from the serach result 
4.add to cart 
5.logout*/

//5.Login>>dropdown>>Books>>Search a book>>Logout

package amazonPracticeTestNG.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment148 extends Launch_quit {
	@Test
	public void login_DD_books_srch_Book_logout() throws InterruptedException {

		WebElement cate_dd = driver.findElement(By.id("searchDropdownBox"));

		Select s1 = new Select(cate_dd);

		s1.selectByVisibleText("Books");

		WebElement amsearch_tf = driver.findElement(By.id("twotabsearchtextbox"));
		amsearch_tf.sendKeys("Software Testing");
		amsearch_tf.sendKeys(Keys.ENTER);
	}
}
