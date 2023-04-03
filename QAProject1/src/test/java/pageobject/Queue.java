package pageobject;


	import org.openqa.selenium.By;
	import org.testng.Reporter;

	import Base.BaseClass;
	import utilities.*;

	public class Queue extends BaseClass {
		
	//String code= "print('hello')";
		
		By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
		By queue=By.xpath("//a[text()='Queue']");
		By queuephython= By.xpath("//a[text()='Implementation of Queue in Python']");
		By queuecollection= By.xpath("//a[text()='Implementation using collections.deque']");
		By queueArray= By.xpath("//a[text()='Implementation using array']");
		By queueOp= By.xpath("//a[text()='Queue Operations']");
		By tryhere= By.xpath("//a[text()='Try here>>>']");
		By input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
		By run= By.xpath("//form[@id='answer_form']/button");
		By practiceQ= By.xpath("//a[text()='Practice Questions']");
		By Topics=By.xpath("//body/div/ul/a[@class='list-group-item']");
		
		//By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
		public void dropdown ( ) throws Exception {
			
			try
			{
				for(int i=1;i<=6;i++)
				{
				
					driver.findElement(dropdown).click();
					driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a["+i+"]")).click();
				
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void Quesel()
		{
			driver.findElement(dropdown).click();;
			driver.findElement(queue).click();;
			Reporter.log("Queue is selected");
		}

		
		
		public void performQueue() throws Exception
		{
		   
			
			
			String[][] code= ExcelReader.getData("sheet2");
			int size= driver.findElements(Topics).size();
			for(int j=1; j<=size;j++)
			{
				By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
				driver.findElement(Topic).click();
				//System.out.println("Topic is: "+ Topic);

			for(int i=0;i<code.length;i++)
			{
				driver.findElement(tryhere).click();
				
				//System.out.println(code);

				driver.findElement(input).sendKeys(code[i]);
				driver.findElement(run).click();

				try {
					driver.switchTo().alert().accept();
				}
				catch(Exception e){
					//e.printStackTrace();
				}

				driver.navigate().back();
				
			}
			driver.navigate().back();
			}
			driver.navigate().forward();
		}
		
		public void practiceQ() throws Exception
		{
			driver.findElement(queuephython).click();
			driver.findElement(practiceQ).click();
			dropdown();
		}

	}


