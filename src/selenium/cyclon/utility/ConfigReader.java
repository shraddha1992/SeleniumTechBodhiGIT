package selenium.cyclon.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties pro;
	FileInputStream fis;


	public void ConfigsetUp() throws Exception
	{
		System.out.println("Before Test Method");

		File src = new File("G:\\SeleniumPracticals\\SeleniumPractice\\Configuration\\config.property");

		fis = new FileInputStream(src);

		pro = new Properties();

		pro.load(fis);
	}
	public String getChromePath()
	{

		String chromepath = pro.getProperty("ChromeDriver");

		System.out.println("Chrome path: "+chromepath);

		return chromepath;
	}

	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("FirefoxDriver");
		
		System.out.println("FireFox path: "+firefoxpath);
		
		return firefoxpath;
	}
	public String getIEPath()
	{
		String iepath = pro.getProperty("IEDriver");
		
		System.out.println("IE path : "+iepath);
		
		return iepath;
	}
	
}
