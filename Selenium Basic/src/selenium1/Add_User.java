package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Add_User {
	
	public static void main(String[] args) {
		
		//step 1:
		WebDriver driver=new FirefoxDriver();
		//Step 2: Enter URL
		driver.get("file:///C:/Java/Offline%20Website/index.html");
		
		// maximise window 
		driver.manage().window().maximize();
		
		//Enter Email
		WebElement email=driver.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("kiran@gmail.com");
		
		//Enter password
		WebElement password=driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("123456");
				
		WebElement login=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		login.click();
		
		// ----------------------------------------------------------------//
				// User button
				// ----------------------------------------------------------------//

				WebElement user = driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
				user.click();

				// ----------------------------------------------------------------//
				// Add User button
				// ----------------------------------------------------------------//

				WebElement adduser = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
				adduser.click();

				// ----------------------------------------------------------------//
				// user name/mobile/gender/email/state/password = fields
				// ----------------------------------------------------------------//

				WebElement name = driver.findElement(By.xpath(".//*[@id='username']"));
				name.sendKeys("AM");
				
				WebElement mobile = driver.findElement(By.xpath(".//*[@id='mobile']"));
				mobile.sendKeys("1234567890");
				
				WebElement email1 = driver.findElement(By.xpath(".//*[@id='email']"));
				email1.sendKeys("am@gmail.com");
				
				// add round button to select gender 
				
				WebElement gender = driver.findElement(By.xpath(".//*[@id='Male']"));
				gender.sendKeys("Male");
				
				// add drop down menu to select state 
				
				WebElement state = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select"));
			    
				Select S= new Select(state);
				S.selectByVisibleText("HP");
				
				//state.sendKeys("Maharashtra");

				WebElement password1 = driver.findElement(By.xpath(".//*[@id='password']"));
				password1.sendKeys("12345");
				
			    //submit new user
				
				WebElement button = driver.findElement(By.xpath(".//*[@id='submit']"));
				button.click();
		
		WebElement logout=driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a"));
		logout.click();	
		
		
		
		

}


}
