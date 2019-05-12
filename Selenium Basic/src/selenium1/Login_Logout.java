package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Logout {

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
				
				WebElement logout=driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a"));
				logout.click();
				
				
				
				
				

	}

}
