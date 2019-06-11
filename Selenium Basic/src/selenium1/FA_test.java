package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FA_test {
	
public static void main(String[] args) {
		
		//step 1:
		WebDriver driver=new FirefoxDriver();
		//Step 2: Enter URL
		driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
		
		// maximise window 
		driver.manage().window().maximize();
		
		//Register New User link  
		
		WebElement register=driver.findElement(By.xpath("html/body/div[1]/div/a"));
		register.click();
		
		// configure new username 
		
		WebElement username=driver.findElement(By.xpath(".//*[@id='login']"));
		username.sendKeys("userid4321");
		
		//configure password
		
		WebElement password1=driver.findElement(By.xpath(".//*[@id='password1']"));
		password1.sendKeys("test321");
		
		//confirm password
		
		WebElement password2=driver.findElement(By.xpath(".//*[@id='password2']"));
		password2.sendKeys("test321");
		
		// Register submit 		
		WebElement submit=driver.findElement(By.xpath(".//*[@id='submit']"));
		submit.click();
		
// Go to List Categories to Create Category
		
		WebElement mmcategory=driver.findElement(By.xpath(".//*[@id='go_list_categories']"));
		mmcategory.click();
		
		// Add category 1 click 
		
		WebElement Addcategory1=driver.findElement(By.xpath(".//*[@id='go_add_category']"));
		Addcategory1.click();
		
		// Add category 1
		
		WebElement category1=driver.findElement(By.xpath(".//*[@id='name']"));
		category1.sendKeys("home expense");
		
		// category 1 submit 
		
		WebElement csubmit1=driver.findElement(By.xpath(".//*[@id='submit']"));
		csubmit1.click();
		
		// Add category 2 click 
		
		WebElement Addcategory2=driver.findElement(By.xpath(".//*[@id='go_add_category']"));
		Addcategory2.click();
				
		// Add category 2 
				
		WebElement category2=driver.findElement(By.xpath(".//*[@id='name']"));
		category2.sendKeys("travel expense");
				
	   // category 2 submit 
				
		WebElement csubmit2=driver.findElement(By.xpath(".//*[@id='submit']"));
		csubmit2.click();
		
// Add category 3 click 
		
        WebElement Addcategory3=driver.findElement(By.xpath(".//*[@id='go_add_category']"));
        Addcategory3.click();
						
		//	 Add category 3 
						
		WebElement category3=driver.findElement(By.xpath(".//*[@id='name']"));
		category3.sendKeys("new expense");
						
		// category 3 submit 
						
		WebElement csubmit3=driver.findElement(By.xpath(".//*[@id='submit']"));
		csubmit3.click(); 
				
		// Edit category 
				
		//WebElement c3edit=driver.findElement(By.xpath(".//*[@id='edit1004']/img"));				c3edit.click(); 
			
		WebElement c4edit=driver.findElement(By.cssSelector("css=edit category#edit1016"));
		c4edit.click(); 
		
		
		
	//	WebElement c5edit=driver.findElement(By.);
		// c5edit.click(); 
		
		//	 new cat 3 name 
				WebElement category4=driver.findElement(By.xpath(".//*[@id='name']"));
			category4.sendKeys("new expense");
						
					// category 3 resubmit 
						
				WebElement csubmit4=driver.findElement(By.xpath(".//*[@id='submit']"));
				csubmit4.click(); 
				
							
				// Delete Category 
				
				WebElement c4delete1=driver.findElement(By.xpath(".//*[@id='delete1004']/img]"));
				c4delete1.click(); 
				
				
				
				
// Go to Add expense to create new expense
		
		WebElement mmexpense1=driver.findElement(By.xpath(".//*[@id='go_add_expense']"));
		mmexpense1.click();
				
// Add expense 1 routine 
		
		  //Configure date 
		
		    //Add day 
		
		    WebElement Day1=driver.findElement(By.xpath(".//*[@id='day']"));
		    Day1.sendKeys("09");
		    
		    //Add Month 
			
		    WebElement Month1=driver.findElement(By.xpath(".//*[@id='month']"));
		    Month1.clear();
			Month1.sendKeys("1");
		    
		    //Add Year 
			
		    WebElement Year1=driver.findElement(By.xpath(".//*[@id='year']"));
		    Year1.sendKeys("2019");
		    
	// Select category from drop down menu  
			
	   WebElement categoryselect = driver.findElement(By.xpath(".//*[@id='category']"));
		    
	   Select C= new Select(categoryselect);
       C.selectByVisibleText("home expense");
			
	//  Configure expense amount 
		
	    WebElement Amount1=driver.findElement(By.xpath(".//*[@id='amount']"));
	    Amount1.sendKeys("10.00");	
	    
	//  Configure expense reason  
		
	    WebElement reason1=driver.findElement(By.xpath(".//*[@id='reason']"));
	    reason1.sendKeys("Internet");	
	    
	 // expense submit 
		
	 	WebElement ex1submit=driver.findElement(By.xpath(".//*[@id='submit']"));
	 	ex1submit.click();
	 		
// Go to Add expense to create new expense
			
	WebElement mmexpense2=driver.findElement(By.xpath(".//*[@id='go_add_expense']"));
	mmexpense2.click();
	 			 		
// Add expense 2 routine 
			
	 //Configure date 
			
	          //Add day 
			
			    WebElement Day2=driver.findElement(By.xpath(".//*[@id='day']"));
			    Day2.sendKeys("05");
			    
			  //Add Month 
			    
			  WebElement Month2=driver.findElement(By.xpath(".//*[@id='month']"));
			  Month2.clear();
			  Month2.sendKeys("1");
			  
			  //Add Year 
				
			  WebElement Year2=driver.findElement(By.xpath(".//*[@id='year']"));
			  Year2.sendKeys("2019");
			    
		// Select category from drop down menu  
				
		   WebElement categoryselect1 = driver.findElement(By.xpath(".//*[@id='category']"));
			    
		   Select C2= new Select(categoryselect1);
	       C2.selectByVisibleText("travel expense");
				
		//  Configure expense amount 
			
		    WebElement Amount2=driver.findElement(By.xpath(".//*[@id='amount']"));
		    Amount2.sendKeys("30.00");	
		    
		//  Configure expense reason  
			
		    WebElement reason2=driver.findElement(By.xpath(".//*[@id='reason']"));
		    reason2.sendKeys("Bus Travel");	
		    
		 // expense submit 
			
		 	WebElement ex2submit=driver.findElement(By.xpath(".//*[@id='submit']"));
		 	ex2submit.click();
	 		
// List expenses routine
	 			
	    // WebElement listexpense1=driver.findElement(By.xpath(".//*[@id='go_list_expenses']"));
	    // listexpense1.click();	
	     
	     // to add more basic tests here 
	    
// Go to Show statistics routine
			
	     WebElement showstats1=driver.findElement(By.xpath(".//*[@id='go_show_statistics']"));
	     showstats1.click(); 
	     
	  // Select month to display statistics from drop down menu  
			
		   WebElement monthselect1 = driver.findElement(By.xpath("html/body/div[1]/div[1]/form/select"));
			    
		   Select M1= new Select(monthselect1);
	       M1.selectByVisibleText("2019.01");
	       
	       // add some test cases if possible 
	      
	       
// Go to edit account routine
			
     WebElement editaccount1=driver.findElement(By.xpath(".//*[@id='editaccount']"));
     editaccount1.click(); 
     
   //edit password - send old password 
		
   		WebElement oldpassword1=driver.findElement(By.xpath(".//*[@id='password']"));
   		oldpassword1.sendKeys("test321");
   		
   		// new password
   		WebElement newpassword1=driver.findElement(By.xpath(".//*[@id='newpassword1']"));
   		newpassword1.sendKeys("test321");
   		
     	// repeat new password
   		WebElement rnewpassword1=driver.findElement(By.xpath(".//*[@id='newpassword2']"));
   		rnewpassword1.sendKeys("test321");
   		
        // update account submit		
   		WebElement submit2=driver.findElement(By.xpath(".//*[@id='submit']"));
   		submit2.click();
     
 // Log out User 
   		
		WebElement logout1=driver.findElement(By.xpath(".//*[@id='logout']"));
		logout1.click();	
		
		
		driver.close();
		
}

}
