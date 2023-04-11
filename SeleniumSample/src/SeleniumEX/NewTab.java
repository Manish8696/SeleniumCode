package SeleniumEX;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v3/index.php");
//		//JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.switchTo().newWindow(WindowType.TAB);
//		//js.executeScript("window.open();");
//		ArrayList<String> s23 = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(s23);
//		driver.switchTo().window(s23.get(0));
//		driver.get("https://demo.guru99.com/v3/index.php");
//		Thread.sleep(500);
		driver.switchTo().newWindow(WindowType.WINDOW);
		ArrayList<String> s32 = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(s32);
		driver.switchTo().window(s32.get(1));
		Thread.sleep(500);
        driver.get("https://hms.techcanvass.co/");  
		Thread.sleep(500);
		driver.switchTo().window(s32.get(0));
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		Thread.sleep(500);
//       driver.quit();

		
		

		
		
	}

}
