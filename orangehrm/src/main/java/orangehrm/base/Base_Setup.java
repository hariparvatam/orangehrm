package orangehrm.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Setup {
	public static WebDriver driver;
	public static Properties prop;
	public String path="C:\\Users\\RAMU\\git\\orangehrm\\orangehrm\\Properties_File\\data.properties";
	 public Base_Setup(){
		
		 try{
			 prop=new Properties();
			 FileInputStream ip=new FileInputStream(path);
			 prop.load(ip);
		 }
		 catch( Exception e){
			 System.out.println("File not found");
		 }
	 }
	 public static void initilization(){
		 String browser=prop.getProperty("browser");
		 
		 if(browser.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMU\\git\\orangehrm\\orangehrm\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 else if(browser.equals("chrome")){
			 System.setProperty("webdriver.gecko.driver", "driver");
			 driver=new FirefoxDriver();
		 }
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	 }

	

}
