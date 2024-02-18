/* J_Richardson_AB_37
 * Assignment -130
Launch online sbi link,
click on login button,
 and inspect username,password and captcha(not required)*/

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment130 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");// launch SBI login website
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement login_btn = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));// use F12 button (will
																								// open inspect mode)
																								// and use
																								// the click on element
																								// to inspect button in
																								// the network tab
		login_btn.click();

		WebElement username_tf = driver.findElement(By.xpath("//input[@name='userName']"));
		username_tf.sendKeys("jrichardso@gmail.com");

		WebElement pswd_tf = driver.findElement(By.xpath("//input[@name='password']"));
		pswd_tf.sendKeys("9916455168");

		WebElement login_btn_1 = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		login_btn_1.click();

	}

}
