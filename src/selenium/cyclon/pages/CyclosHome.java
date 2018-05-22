package selenium.cyclon.pages;

import org.testng.annotations.Test;

import selenium.cyclon.utility.Base;

public class CyclosHome extends Base {

	@Test
    public void register()
    {
    	driver.get("https://demo.cyclos.org/");
    	driver.manage().window().maximize();
    }
	
}
