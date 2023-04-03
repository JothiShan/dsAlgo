package pageobject;


	


	import java.io.IOException;

	//import javax.lang.model.element.Element;

	import org.openqa.selenium.By;
	//import org.openqa.selenium.WebElement;
	//import org.testng.annotations.DataProvider;
	//import org.testng.annotations.Test;

	import Base.BaseClass;
	//import utility.DPclass;
	import utilities.ExcelReader;

	
	public class Graphpage extends BaseClass {	
		

		By dropDown=By.xpath("//a[@class='nav-link dropdown-toggle']");
		By Graph = By.xpath("//div[@class='nav-item dropdown show']//div//a[6]");
		//By Graph= By.xpath("//div//div[7]//div//div//a[contains(text(),'Get Started')]");
		By Topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
		By tryHere= By.xpath("//a[contains (text(), 'Try here')]");
		By textInput= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
		By Run= By.xpath("//button[@type='button']");
		By topicGraph = By.xpath("//a[@href='graph']");
		By PracticeQue = By.xpath("//a[text()='Practice Questions']");
		
		
		public void clickGraph() throws IOException, InterruptedException {
			
			driver.findElement(dropDown).click();	
			driver.findElement(Graph).click();
			}
		
		
		 
		public void AccessGraph() throws IOException, InterruptedException {
			
			String[][] code= ExcelReader.getData("sheet3");
			
			
			System.out.println("after code0");
			
		
		
		for( int j=2;j<=3;j++) {
			
		By Topic= By.xpath("//body/div/ul[" + j+ "]/a[@class='list-group-item']");
		  
		//Thread.sleep(1000);
		    driver.findElement(Topic).click();
			driver.findElement(tryHere).click();
		    driver.findElement(textInput).sendKeys(code[0]);
		    driver.findElement(Run).click();	
			    
				try {
					driver.switchTo().alert().accept();
				}
				catch(Exception e){
				}
					driver.navigate().back();
		   
			driver.navigate().back();
		 }
		}
		

		public void practiceQ()
		{
			driver.findElement(topicGraph).click();
			driver.findElement(PracticeQue).click();
			
		}
		
	}




