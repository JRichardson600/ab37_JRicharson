/* J_Richardson_AB_37
 * Assignment -129
Handle javascript popup of growtechminds application 
and get the title of the page*/

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment129 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Richard/OneDrive/Documents/learningHTML1.html");
		driver.switchTo().alert().dismiss();// to handle the javascript pop ups-using the  dismiss keyword
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("Get title of the JSAM app : " + driver.getTitle());//get the title of the web page
		//System.out.println("Get title of the JSAM app : " + driver.getCurrentUrl());//get the url of the web page
	}

}
