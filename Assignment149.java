/* J_Richardson_AB_37
 * Assignment -149
create a class which has 2 @test with priority as 1,
and find out which one executes first */
package TestNGAssigments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment149 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement canadaLoc = driver.findElement(By.xpath("( //div[@class='yt-spec-touch-feedback-shape__fill'])[1]"));
		Point location = canadaLoc.getLocation();
		int x = location.getX();
		int y = location.getY();

		System.out.println(x);// ull get values in pixel values
		System.out.println(y);// ull get values in pixel values

		JavascriptExecutor jse = driver;
		// jse.executeScript("window.scrollBy(0,700)");

		for (int i = 0; i < 100; i++) {
			y = y + 1000;
			jse.executeScript("window.scrollBy(0," + y + ")");
			Thread.sleep(5000);

		}

		// jse.executeScript("window.scrollBy(0,"+ y +")");

	}

}
