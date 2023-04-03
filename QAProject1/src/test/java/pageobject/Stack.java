package pageobject;

import java.io.IOException;

import org.openqa.selenium.By;

import Base.BaseClass;
import utilities.ExcelReader;

public class Stack extends BaseClass {
	
	By dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By stack = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	By operationsinstack = By.xpath("//a[text()='Operations in Stack']");
	By tryhere =By.xpath("//a[text()='Try here>>>']");
	By input = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By run = By.xpath("//button[text()='Run']");
	By implementation = By.xpath("//a[text()='Implementation']");
	By application = By.xpath("//a[text()='Applications']");
	By practisequestion = By.xpath("//a[text()='Practice Questions']");
	By stacktopic = By.xpath("//div//ul/a[@class='list-group-item']");
	
	
	public void dropdown()
	{
		driver.findElement(dropdown).click();
		driver.findElement(stack).click();
	}
	public void performancestack () throws IOException 
	{
		String[][] code= ExcelReader.getData("sheet2");
		int l=code.length;
		int size= driver.findElements(stacktopic).size();

		for(int j=1; j<=size;j++)
		{
			By Topic= By.xpath("//body/div/ul['+j+']/a[@class='list-group-item']");
			driver.findElement(Topic).click();

		
			for(int i=0;i<l;i++)
			{
				driver.findElement(tryhere).click();

				driver.findElement(input).sendKeys(code[i]);
				driver.findElement(run).click();

				try {
					driver.switchTo().alert().accept();
				}
				catch(Exception e){
					
				}

				driver.navigate().back();

			}
			driver.navigate().back();
		}
		
	}
	

}
