package pageobject;

//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseClass;
//import io.cucumber.core.logging.Logger;
//import org.apache.logging.log4j.LogManager;
import org.apache.log4j.BasicConfigurator;

public class homepage  extends BaseClass {
	
	//private static Logger log = (Logger) LogManager.getLogger(homepage.class);
	//private static Logger log= LogManager.getLogger(Home.class);
	private static Logger log = LogManager.getLogger(homepage.class);
	
	By Register = By.xpath("//div/ul/a[2]");
	By signin =By.xpath("//div/ul/a[3]");
	By datastructure =By.xpath("//div[@class='nav-item dropdown']/a");
	By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
	By Arrays  = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By alert= By.xpath("//div[@class='alert alert-primary']");
	By stack = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	
	
@Test


	public void Register () {
	
	  driver.findElement(Register).click();
	
	  }
	  
	public void singin () {
		
		driver.findElement(signin).click();
	}
	
	public void dropdown ( ) {
		
		 
		for(int i=1;i<=6;i++)
		{
			//Thread.sleep(1000);
			driver.findElement(dropdown).click();
			driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a["+i+"]")).click();
			String text=driver.findElement(alert).getText();
			System.out.println("The alert message is "+ text);
			  log.info("The error "+ text);
		}
		
	}
	public  void Arrays() {
		
		driver.findElement(dropdown).click();
		driver.findElement(Arrays).click();
		String text=driver.findElement(alert).getText();
		System.out.println("The alert message is "+ text);
	
	}

	public void stack() {
		driver.findElement(dropdown).click();
		driver.findElement(stack).click();
		String text=driver.findElement(alert).getText();
		System.out.println("The alert message is "+ text);
	
		
	}
	

	
}
