/* J_Richardson_AB_37
 * Assignment -117
Launch (JSAM) HTML page get elements by xpath(absolute xpath)*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment117 {
 
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/Richard/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("jrichardson5482gmail.com");//username
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Lionel Messi");//hint
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("jrichy87452");//password
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Richardson");//firstname
		
		driver.findElement(By.xpath("(((/html/body/form)[2])/input)[1]")).click();//I have a boy
		driver.findElement(By.xpath("(((/html/body/form)[2])/input)[2]")).click();//I have a girl
		driver.findElement(By.xpath("(((/html/body/form)[2])/input)[3]")).click();//I have a baby
		
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();//Who are you-Male
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();//Who are you-Female
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();//Are you willing to relocate to bangalore
		
		
//		Thread.sleep(5000);
//		driver.close();
	}

}