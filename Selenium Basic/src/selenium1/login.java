package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		// maximise window 
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Java/Offline%20Website/index.html");

		// ----------------------------------------------//
		// Email and Password
		// -----------------------------------------------//

		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("kiran@gmail.com");

		WebElement pass = driver.findElement(By.xpath(".//*[@id='password']"));
		pass.sendKeys("123456");
		
		WebElement login = driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		login.click();

		//WebElement button = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		//button.click();

		// ----------------------------------------------------------------//
		// User button
		// ----------------------------------------------------------------//

		WebElement user = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
		user.click();

		// ----------------------------------------------------------------//
		// Add User button
		// ----------------------------------------------------------------//

		WebElement adduser = driver.findElement(By.xpath("//button[contains(text(),'Add User')]"));
		adduser.click();

		// ----------------------------------------------------------------//
		// user name/mobile/gender/email/state/password = fields
		// ----------------------------------------------------------------//

		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("Nilesh");

	}

}

