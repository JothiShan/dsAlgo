package pageobject;

import java.io.IOException;

import org.openqa.selenium.By;

import Base.BaseClass;
import utilities.ExcelReader;

public class signin extends BaseClass{
	
	By signin = By.xpath("//div/ul/a[3]");
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login    = By.xpath("//input[@type='submit']");
	By logout = By.xpath("//a[@href='/logout']");
	By logoutalert = By.xpath("//div[@class='alert alert-primary']");
	
public void Signin() {
	driver.findElement(signin).click();
	driver.findElement(username).sendKeys(prop.getProperty("Susername"));
	driver.findElement(password).sendKeys(prop.getProperty("Spassword"));
	driver.findElement(login).click();
	}

public void signInValid() throws InterruptedException
{
	driver.findElement(signin).click();
	driver.findElement(username).sendKeys(prop.getProperty("Invalidusername"));
	driver.findElement(password).sendKeys(prop.getProperty("Invalidpassword"));
	
	driver.findElement(login).click();

}
public void logoutonly() {
	
	driver.findElement(logout).click();
}
public void logout() throws InterruptedException
{
	driver.findElement(signin).click();
	driver.findElement(username).sendKeys(prop.getProperty("Susername"));
	driver.findElement(password).sendKeys(prop.getProperty("Spassword"));
	driver.findElement(login).click();
	driver.findElement(logout).click();
}
public void signinExcel() throws InterruptedException, IOException {
	
	driver.findElement(signin).click();
	String[][] input= ExcelReader.getData("sheet1");
	int row= input.length;
	
	for(int i=0;i<row;i++)

	{
		driver.findElement(username).sendKeys(input[i][0]);
		driver.findElement(password).sendKeys(input[i][1]);
		driver.findElement(login).click();


	}
	
}






}
