package selenium.cyclon.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base extends ConfigReader {

	public  WebDriver driver = null;
	
	public void BrowserBasic()
	{
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{	

			System.setProperty("webdriver.chrome.driver", getChromePath());
			driver = new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("firefox"))  
		{

			System.setProperty("webdriver.gecko.driver", getFirefoxPath());
			driver = new FirefoxDriver();

		}

		else if(browser.equalsIgnoreCase("ie"))
		{

			System.setProperty("webdriver.ie.driver", getIEPath());
			driver = new InternetExplorerDriver();

		}	
	}
		
	}

