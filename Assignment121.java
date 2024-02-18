/* J_Richardson_AB_37
 * Assignment -121
Launch GrowTechminds registraion form,
locate every element 
except Dropdowns(skills/country/religion/choose file) and 
Upload file button and perform action on each element using WebElement*/

package Assignments;

import java.util.Arrays;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment121 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");// launch FB
		driver.manage().window().maximize();
		
		WebElement firstname_tf = driver.findElement(By.xpath("//input[@id=\"fname\"]"));// firstname
		firstname_tf.sendKeys("Richardson");

		WebElement lastname_tf = driver.findElement(By.xpath("//input[@id=\"lname\"]"));// lastname
		lastname_tf.sendKeys("Johnson");

		WebElement username_tf = driver.findElement(By.xpath("//input[@id=\"Username\"]"));// Username
		username_tf.sendKeys("jrichardson5404@gmail.com");

		WebElement password_tf = driver.findElement(By.xpath("//input[@id=\"password\"]"));// password
		password_tf.sendKeys("test1234");
		
		WebElement gendermale_rb = driver.findElement(By.xpath("//input[@id=\"Male\"]"));// gendermale_rb
		gendermale_rb.click();
		
		WebElement genderfemale_rb = driver.findElement(By.xpath("//input[@id=\"FeMale\"]"));// genderfemale_rb
		genderfemale_rb.click();
		
		WebElement presentadd_tf = driver.findElement(By.xpath("//textarea[@id=\"w3review\"]"));// presentadd_tf
		presentadd_tf.sendKeys("qwerty bangalore-560097");

		WebElement premadd_tf = driver.findElement(By.xpath("//textarea[@id=\"Address\"]"));// premadd_tf
		premadd_tf.sendKeys("qwerty bangalore-560097");
		
		WebElement pincode_tf = driver.findElement(By.xpath("//input[@id=\"Pincode\"]"));// premadd_tf
		pincode_tf.sendKeys("560097");
		
		WebElement agree_cb = driver.findElement(By.xpath("//input[@id=\"Agree\"]"));// agree_cb
		agree_cb.click();
		
//		WebElement submit_btn = driver.findElement(By.xpath("//input[@value=\"Submit\"]"));// agree_cb
//		submit_btn.click();
			
	}

}