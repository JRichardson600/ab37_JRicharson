/* J_Richardson_AB_37
 * Assignment -147
write testNG classes for the following 
1.login to amazon 
2.search for a pen 
3.select anyone from the serach result 
4.add to cart 
5.logout*/

//4.Login>>Search>>Pen>>Open One>>Pen deatils>>add directly to cart>>Logout

package amazonPracticeTestNG.copy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment147_1 extends Launch_quit {
	@Test
	public void login_Search_Pen_addToCart_logout() throws InterruptedException {
		WebElement amsearch_tf = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(1000);
		amsearch_tf.sendKeys("pen");

		WebElement search_btn = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(1000);
		search_btn.click();

		List<WebElement> results = driver
				.findElements(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])"));
		int count_am_sug = results.size();

		// System.out.println(count_am_sug);

		Thread.sleep(2000);// thread.sleep 5secs

		results.get(count_am_sug - 20).click();
		Set<String> pen_shoe = driver.getWindowHandles();

		Iterator<String> pcId = pen_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

		WebElement wishList_btn = driver.findElement(By.id("add-to-cart-button"));
		Thread.sleep(2000);
		wishList_btn.click();
		Thread.sleep(1000);

		WebElement close_btn = driver.findElement(By.id("attach-close_sideSheet-link"));
		Thread.sleep(2000);
		close_btn.click();
		Thread.sleep(1000);

	}
}
