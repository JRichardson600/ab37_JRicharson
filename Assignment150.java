/* J_Richardson_AB_37
 * Assignment -150
write a testng code to fetch double datatype values 
from a method using dataprovider annotation*/

package TestNGAssigments;

import java.time.Duration;
import java.util.EventObject;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment150 {

	@Test(dataProvider = "listOfCity")
	public void method1_for_addition(String inputData) {
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");// launch Google .com

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement google_sf = driver.findElement(By.name("q"));
		google_sf.sendKeys(inputData);
		google_sf.sendKeys(Keys.ENTER);

		System.out.println(driver.getTitle());

		// driver.quit();
	}

	@DataProvider(name = "listOfCity")
	public Object[][] method2() {
		return new Object[][] { { "Bangalore" }, { "Delhi" }, { "Mumbai" }, { "Chennai" }, { "Hyderabad" } };
	}

}
