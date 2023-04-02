package SeleniumEX;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestions {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\moolya\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().deleteAllCookies();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement e = driver.findElement(By.xpath("//input[@class='gLFyf']"));
e.sendKeys("manish");

List<WebElement> lk = driver.findElements(By.xpath("//li[contains(@class,'sbct')]"));
System.out.println(lk.size());
int p = 0;
for(int i=0;i<lk.size();i++) {
	System.out.println(lk.get(i).getText());
}
	}

}
