/* J_Richardson_AB_37
 * Assignment -137
write a testNG code which has BS,BT,BC ,BM and one @test*/

package TestNGAssigments;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment137 {
@BeforeSuite
public void add() {
	System.out.println("Addition");
}
@BeforeTest
public void sub() {
	System.out.println("Subtraction");
}
@BeforeClass
public void mul() {
	System.out.println("Multiplication");
}
@BeforeMethod
public void div() {
	System.out.println("Division");
}

@Test
public void testCas1() {
	System.out.println("TestCas1");
}


}