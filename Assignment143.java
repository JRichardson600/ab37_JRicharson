/* J_Richardson_AB_37
 * Assignment -143
create a class which has 2 @test with priority as 1,
and find out which one executes first */

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

	@Test(priority = 1)
	public void dtestCase4() {
		System.out.println("TestCase4");
	}

}