package pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

import Base.BaseClass;
import utilities.ExcelReader;

public class Array extends BaseClass { 
	By dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By arrays  = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By arraysinpython = By.xpath("//a[text()='Arrays in Python']");
	By tryhere = By.xpath("//a[text()='Try here>>>']");
	By input =By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By run = By.xpath("//div//button[@type='button']");
	By arraysUsingList =By.xpath("//a[text()='Arrays Using List']");
	By basicoperationlist =By.xpath("//a[text()='Basic Operations in Lists']");
	By aplicationofarray = By.xpath("//a[text()='Applications of Array']");
	By practisequestion = By.xpath("//a[text()='Practice Questions']");
	By searcharray =By.xpath("//a[text()='Search the array']");
	By maxconsecutiveones = By.xpath("//a[text()='Max Consecutive Ones']");
	By findnumbers = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By square = By.xpath("//a[text()='Squares of  a Sorted Array']");
	By topics=By.xpath("//body/div/ul/a[@class='list-group-item']");
	By insidetopic = By.xpath("//body//div[@class='list-group']");
	
	public void dropdown()
	{
		driver.findElement(dropdown).click();
		driver.findElement(arrays).click();
	}
	
	public void performarray ( ) throws IOException
	{
		String[][] code= ExcelReader.getData("sheet2");
		int l=code.length;
		int size= driver.findElements(topics).size();

		for(int j=1; j<=size;j++)
		{
			By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
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
	
	public void practiceQsearcharray () throws IOException
	{
		driver.findElement(arraysinpython).click();
		System.out.println("after arryinpyton");
		driver.findElement(practisequestion).click();
		System.out.println("practisequestion");
		///driver.findElement(searcharray).click();
		///System.out.println("searcharray");
		
		int size= driver.findElements(insidetopic).size();
		System.out.println(size);
		
		

		for(int j=1; j<=size;j++)
		{
			By Topic = By.xpath("//body//div[@class='list-group'][" +j+"]");
			driver.findElement(Topic).click();
		
				for(int i=0;i<=35;i++)
				{
					driver.findElement(input).sendKeys(Keys.DELETE);
		
				}
				String[][] code= ExcelReader.getData("sheet3");
				
				driver.findElement(input).sendKeys(code[0]);
				driver.findElement(run).click();
				System.out.println("after code0");
				try {
					driver.switchTo().alert().accept();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				driver.navigate().back();
				//driver.findElement(searcharray).click();
				driver.findElement(Topic).click();
				
				for(int i=0;i<=28;i++)
				{
					driver.findElement(input).sendKeys(Keys.DELETE);
		
				}
				
				
				driver.findElement(input).sendKeys(code[1]);
				System.out.println("after input");
				driver.findElement(run).click();
				System.out.println("after code1");
				try {
					driver.switchTo().alert().accept();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				driver.navigate().back();
		}	
	}
		
	
	
	/*
	public void maxconsecutiveone ( ) throws IOException
	{
		
		
		driver.findElement(maxconsecutiveones).click();
		
		for(int i=0;i<=35;i++)
		{
			driver.findElement(input).sendKeys(Keys.DELETE);

		}
		String[][] code= ExcelReader.getData("sheet3");
		
		driver.findElement(input).sendKeys(code[0]);
		driver.findElement(run).click();
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.findElement(maxconsecutiveones).click();
		
		for(int i=0;i<=35;i++)
		{
			driver.findElement(input).sendKeys(Keys.DELETE);

		}
		
		
		driver.findElement(input).sendKeys(code[1]);
		driver.findElement(run).click();
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		driver.navigate().back();
		
		
	}
	
	public void findnumbers ( ) throws IOException 
	{
		
		
		driver.findElement(findnumbers).click();
		
		for(int i=0;i<=35;i++)
		{
			driver.findElement(input).sendKeys(Keys.DELETE);

		}
		String[][] code= ExcelReader.getData("sheet3");
		
		driver.findElement(input).sendKeys(code[0]);
		driver.findElement(run).click();
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.findElement(findnumbers).click();
		
		for(int i=0;i<=35;i++)
		{
			driver.findElement(input).sendKeys(Keys.DELETE);

		}
		
		
		driver.findElement(input).sendKeys(code[1]);
		driver.findElement(run).click();
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			e.printStackTrace();
			}
		driver.navigate().back();
	
	}
	
	public void square ( ) throws IOException 
	{
		
		
		driver.findElement(square).click();
		
		for(int i=0;i<=35;i++)
		{
			driver.findElement(input).sendKeys(Keys.DELETE);

		}
		String[][] code= ExcelReader.getData("sheet3");
		
		driver.findElement(input).sendKeys(code[0]);
		driver.findElement(run).click();
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.findElement(square).click();
		
		for(int i=0;i<=35;i++)
		{
			driver.findElement(input).sendKeys(Keys.DELETE);

		}
		
		
		driver.findElement(input).sendKeys(code[1]);
		driver.findElement(run).click();
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			e.printStackTrace();
			
			}
		driver.navigate().back();
		
		
	}
*/
	
}
