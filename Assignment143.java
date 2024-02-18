/* J_Richardson_AB_37
 * Assignment -149
Scroll down on youtube for infinite times */

package TestNGAssigments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment143 {

	@Test(priority = 2)
	public void atestCase1() {
		System.out.println("TestCase1");
	}

	@Test(priority = 3)
	public void btestCase2() {
		System.out.println("TestCase2");
	}

	@Test(priority = 4)
	public void ctestCase3() {
		System.out.println("TestCase3");
	}

	@Test
	public void dtestCase4() {
		System.out.println("TestCase4");
	}

}