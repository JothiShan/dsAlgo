package pageobject;



	import org.openqa.selenium.By;

	import Base.BaseClass;
	import utilities.ExcelReader;

	public class Datastructure extends BaseClass {
		//String code= "print('hello')";
		By DSgetstarted = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]/div/div/a");
		By DStimecomplex = By.xpath("//a[text()='Time Complexity']");
		By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
		By tryhere =By.xpath("//a[text()='Try here>>>']");
		By TextboxInput = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
		By DSRun = By.xpath("//button[text()='Run']");
		
		By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
		public void dropdown ( ) throws Exception {
			
			try
			{
				//for(int i=1;i<=6;i++)
				//{
				    
				   driver.findElement(DSgetstarted).click();
					//driver.findElement(dropdown).click();
					//driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a["+i+"]")).click();
				
				//}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void datastructureopen() throws Exception
		{
			driver.findElement(DSgetstarted).click();
			driver.findElement(DStimecomplex).click();
			String[][] code= ExcelReader.getData("sheet2");
			int l=code.length;

			for(int i=0;i<l;i++)
			{
				driver.findElement(tryhere).click();
				
				//System.out.println(code);

				driver.findElement(TextboxInput).sendKeys(code[i]);
				driver.findElement(DSRun).click();

				try {
					driver.switchTo().alert().accept();
				}
				catch(Exception e){
					e.printStackTrace();
				}

				driver.navigate().back();
				
			}
			
		}
		public void PracticeQ()throws Exception {
			
			driver.findElement(PracticeQ1).click();
			dropdown();
		}

	}
