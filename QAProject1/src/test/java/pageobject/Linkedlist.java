package pageobject;



	import java.io.IOException;

	import org.openqa.selenium.By;
	import Base.BaseClass;
	import utilities.*;

	public class Linkedlist extends BaseClass {

		//By LLgetstarted=By.xpath("//div[@class='dropdown-menu show']/a[2]");
		By LLgetstarted=By.xpath("//a[text()='Linked List']");
		By Topic= By.xpath("//body/div/ul['+j+']/a[@class='list-group-item']");
		By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
		By tryhere =By.xpath("//a[text()='Try here>>>']");
		By TextboxInput = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
		By LLDeletion =By.xpath("//a[text()='Deletion']");
		By Run = By.xpath("//button[text()='Run']");
		
		By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
		public void dropdown ( ) throws Exception {
			
			try
			{
				//for(int i=1;i<=6;i++)
				//{
				
					driver.findElement(dropdown).click();
					driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[2]")).click();
				
				//}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void LList1() throws IOException {
			//driver.findElement(LLgetstarted).click();
			int size= driver.findElements(Topic).size();
			for( int j=1;j<=size;j++) {

				By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
				driver.findElement(Topic).click();

				 { 
					 String[][] code= ExcelReader.getData("sheet2");
				for(int i=0;i<code.length;i++) {
					driver.findElement(tryhere).click();
					driver.findElement(TextboxInput).sendKeys(code[i]);
					driver.findElement(Run).click();


					try {
						driver.switchTo().alert().accept();
					}

					catch (Exception e) {
						
					}
					driver.navigate().back();
				}
				driver.navigate().back(); 	  	
			}
			//driver.navigate().forward();
			}
		}
		public void PracticeQ() {
			//driver.findElement(LLgetstarted).click();
			driver.findElement(LLDeletion).click();
			driver.findElement(PracticeQ1).click();
		}
	}



