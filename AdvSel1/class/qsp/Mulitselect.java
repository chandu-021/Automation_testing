package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mulitselect 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("file:///C:/Users/DELL/Desktop/dd.html");
		  Thread.sleep(2000); 
		  WebElement ele = driver.findElement(By.id("empire"));
		  Select s=new Select(ele);
		  boolean b = s.isMultiple();
		  if(b)
		  {
			  System.out.println("multi select dd");
		  }
		  else
		  {
			  System.out.println("not a multi select dd");
			  System.out.println("not a multi select dd");
			  
		  }
		  
	  }
}
