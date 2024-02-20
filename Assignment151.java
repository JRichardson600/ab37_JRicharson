/* J_Richardson_AB_37
 * Assignment -150
write a testNg program using dataprovider and 
perform the following activities launch google page search for five different cities
bangalore,pune,mumbai,chennai,hyderabad ,
each time u search for cities get their title */

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

public class Assignment151 {

	@Test(dataProvider = "dataInput")
	public void sum(double num) {

		System.out.println(num + 100);

		// jse.executeScript("window.scrollBy(0,"+ y +")");

	}

	@DataProvider(name = "dataInput")
	public Object[][] method1() {
		return new Object[][] { { 1.5 }, { 2.263 }, { 1.2365 }, { 1.2452 }, {} };
	}

}
