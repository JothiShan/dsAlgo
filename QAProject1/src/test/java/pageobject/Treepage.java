package pageobject;


	

	import java.io.IOException;

	import org.openqa.selenium.By;
	//import org.testng.annotations.DataProvider;

	import Base.BaseClass;
	import utilities.ExcelReader;

	public class Treepage  extends BaseClass{

		
		By dropDown=By.xpath("//a[@class='nav-link dropdown-toggle']");
		By tree = By.xpath("//div[@class='nav-item dropdown show']//div//a[5]");
		By topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
		//By topic=By.xpath("//body/div[2]/ul['+i+']/a[@class='list-group-item']");
		By tryHere= By.xpath("//a[contains (text(), 'Try here')]");
		By input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
		By Run= By.xpath("//button[@type='button']");
		By OverviewTree= By.xpath("//a[text()='Overview of Trees']");
		By PracticeQues = By.xpath("//a[text()='Practice Questions']");
		
	public void clickTree() throws IOException, InterruptedException {
			
			driver.findElement(dropDown).click();	
			driver.findElement(tree).click();
			}
	
		
	public void  Tree() throws IOException, InterruptedException {
		
		String[][] code= ExcelReader.getData("sheet3");
		
		
		System.out.println("after code0");
		
		int size= driver.findElements(topic).size();
		System.out.println(size);	
			
			
			for( int j=1;j<=size;j++) {		
			
				By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
			
			        driver.findElement(Topic).click(); 
					driver.findElement(tryHere).click();
					driver.findElement(input).sendKeys(code[0]);
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

	public void PracticeQ()
	{
		driver.findElement(OverviewTree).click();
		driver.findElement(PracticeQues).click();
				
	}
	}



