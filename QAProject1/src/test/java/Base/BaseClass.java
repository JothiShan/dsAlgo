package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageobject.homepage;

public class BaseClass {

	
	private static Logger log = LogManager.getLogger(BaseClass.class);
	public static WebDriver driver;
	public static Properties prop;
	

	public static void Launch() {

	
	prop = new Properties();
	
	String projectDir=System.getProperty("user.dir");
	
	String path=projectDir+"\\src\\test\\resources\\Configuration\\Conf.properties";
	
	FileReader ip;
	try {
System.out.println(projectDir);
System.out.println(path);

		ip = new FileReader(path);
		
		prop.load(ip);
		System.out.println("after loading path");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		System.out.println("inside first catch");

	}
	
	catch (IOException e) {
		
		e.printStackTrace();
		System.out.println("inside second catch");
	}
	 
	String browserName=prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", projectDir+"/src/test/resources/drivers/chromedriver.exe");
			//Loggerload.info("Testing on chrome");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			log.info("browser selected is "+browserName);
			}
		else if (browserName.equalsIgnoreCase("firefox"))
		{  
			System.setProperty("webdriver.chrome.driver", projectDir+"/src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("browser selected is "+browserName);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com/");
		
	}
	
		
	
    
	
		
}




