package SeleniumEX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelect {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\moolya\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);

driver.manage().window().maximize();
driver.get("https://www.wikipedia.org/");
driver.manage().deleteAllCookies();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//Actions a = new Actions(driver);
WebElement h = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
//a.click(h);
//a.sendKeys(Keys.ARROW_DOWN).build().perform();
//a.sendKeys(Keys.ENTER).build().perform();

Select s = new Select(h);
System.out.println(s.isMultiple());
List<WebElement> hj = s.getOptions();
ArrayList<String> lk = new ArrayList<String>();
ArrayList<String> lk1 = new ArrayList<String>();
for(WebElement jh :hj) {
	String s1 = jh.getText();
	lk.add(s1);
	lk1.add(s1);
}
System.out.println(lk);
Collections.sort(lk);
//Collections.sort(lk1);
if(lk.equals(lk1)) {
	System.out.println("great");
}
else {
	System.out.println("offo");
}
HashSet<String> hjj = new HashSet<String>();
for(String sd : lk) {
	hjj.add(sd);
}
System.out.println(hjj);
System.out.println(hjj.size());
System.out.println(lk.size());

Thread.sleep(1000);
s.selectByVisibleText("Afrikaans");
driver.close();

	}

}
