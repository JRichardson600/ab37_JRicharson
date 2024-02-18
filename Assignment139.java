/* J_Richardson_AB_37
 * Assignment -139
write a testNG code which has BM,AM,two  @test*/

package TestNGAssigments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment139 {

	@BeforeMethod
	public void div() {
		System.out.println("BM-Division");
	}

	@Test
	public void testCas1() {
		System.out.println("TestCase1");
	}

	@Test
	public void vtestCas1() {
		System.out.println("TestCase2");
	}

	@AfterMethod
	public void sub() {
		System.out.println("AM-subtraction");
	}

}