package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
static WebDriver driver;
	
	public static WebDriver getDriver(String browsername) {
		
		try {
			if(browsername=="chrome")
			{
				System.setProperty("webdriver.chrome.driver", "D:\\CDEMO\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public void explicitwait(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void btnclick(WebElement  element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public boolean elementIsenabled(WebElement element) {
		
		boolean enabled = element.isEnabled();
		return enabled;

	}
	
	public boolean elementIsdisplayed(WebElement element) {
		
		boolean displayed = element.isEnabled();
		return displayed;

	}
	
	public void setText (WebElement element,  String value) {
		
		explicitwait(element);
		
		if(elementIsdisplayed(element)&&elementIsenabled(element))
		{
			element.clear();
			element.sendKeys(value);
		}
		
	}
	
	public void selectDrop(WebElement e,String value) {
		explicitwait(e);
		Select sc=new Select(e);
		sc.selectByVisibleText(value);
		
	}
	
	public void btngender( WebElement element)
	{
		explicitwait(element);
		element.click();

	}
	
}
