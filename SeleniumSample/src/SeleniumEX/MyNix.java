package SeleniumEX;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyNix {
	
    public static void main(String[] args) throws Exception {
    	
    	String dateInput="9-Mar-2023";
    	
    	String dateNo=dateInput.split("-")[0];    	
    	String month=dateInput.split("-")[1];
    	String year=dateInput.split("-")[2];


    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
       
    	WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://jqueryui.com/datepicker/#buttonbar");        
        
               
        WebElement calendarFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));        
        driver.switchTo().frame(calendarFrame);
        
        driver.findElement(By.id("datepicker")).click();
        
        
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        
        for(WebElement date : dates)
        {
        	if(date.getText().equals(dateNo))
        	{
        		date.click();
        	}
        }
            
        
//       Thread.sleep(2000);
//        
//       driver.quit();

    	
    }


}
