/* J_Richardson_AB_37
 * Assignment -146
write testNG classes for the following 
1.login to amazon
2.search for a pen
3.select anyone from the search result
4.add ro wishlist 
5.logout*/

//3.Login>>Search>>Pen>>Open One>>Pen deatils>>Add to wishLIST>>Logout

package amazonPracticeTestNG.copy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment146 extends Launch_quit {

	@Test
	public void login_Search_Pen_Wishlist_logout() throws InterruptedException {
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

		WebElement wishList_btn = driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
		Thread.sleep(2000);
		wishList_btn.click();
		Thread.sleep(1000);

		WebElement cntshop_btn = driver
				.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']"));
		Thread.sleep(2000);
		cntshop_btn.click();
		Thread.sleep(1000);
	}
}
