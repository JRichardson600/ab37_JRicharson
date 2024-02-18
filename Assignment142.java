/* J_Richardson_AB_37
 * Assignment -142
create a class add 4 @test in one @test add invocationCount=11 
find out number of test cases executed add AM and BM to it */

package TestNGAssigments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment142 {

	@BeforeMethod
	public void div() {
		System.out.println("BM-Division");
	}

	@Test
	public void atestCase1() {
		System.out.println("TestCase1");
	}

	@Test(invocationCount = 11)
	public void btestCase1() {
		System.out.println("TestCase2");
	}

	@Test
	public void ctestCase3() {
		System.out.println("TestCase3");
	}

	@Test
	public void dtestCase4() {
		System.out.println("TestCase4");
	}

	@AfterMethod
	public void sub() {
		System.out.println("AM-subtraction");
	}

}