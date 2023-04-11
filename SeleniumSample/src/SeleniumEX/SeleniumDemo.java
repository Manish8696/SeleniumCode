package SeleniumEX;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\moolya\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/v3/index.php");

// navigate method : ----------------------------------------
//driver.navigate().to("https://demo.guru99.com/v3/index.php");
//driver.navigate().refresh();
//driver.navigate().back();
//driver.navigate().forward();

driver.manage().deleteAllCookies();

// way to introduce implicitly wait --------------------------------------
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement e = driver.findElement(By.name("uid"));
e.sendKeys("mngr485611");


// to get the font size of webelement--------------------------------------
System.out.println(e.getCssValue("font-size"));

//1.to get text present in text box---------------------------------------
String si = e.getAttribute("value");
System.out.println(si);

// 2.To find the size of any webelement-----------------------------------
WebElement qw = driver.findElement(By.xpath("//td[text()='UserID']"));
Dimension di = qw.getSize();
int h = di.getHeight();
int p = di.getWidth();
System.out.println(h+":"+p);

// 3.to find the color of webelement---------------------------------------
System.out.println(qw.getCssValue("color"));

driver.findElement(By.name("password")).sendKeys("Usajupa");
WebElement pop= driver.findElement(By.name("btnLogin"));

//4.  use of javascript executor------------------------------------------------
RemoteWebDriver r = (RemoteWebDriver) driver;
WebElement ep = driver.findElement(By.xpath("//li[text()='Enter your email id']"));
// to scroll
r.executeScript("arguments[0].scrollIntoView();", ep);
Thread.sleep(1000);
e.clear();
Thread.sleep(500);
// to input value
r.executeScript("arguments[0].value=arguments[1]",e,"mngr485611");
Thread.sleep(500);
// to click
r.executeScript("arguments[0].click();",pop);

// to take screenshot---------------------------------------------------------------
//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(screenshotFile, new File("path/to/screenshot.png"));

String s = driver.getTitle();
//Thread.sleep(2000);
// 5.to set the size of browser -----------------------------------------------
//Dimension d = new Dimension(200,200);
//driver.manage().window().setSize(d);
//Thread.sleep(2000);

// 6.to set position of browser ------------------------------------------------
//Point p = new Point(300,200);
//driver.manage().window().setPosition(p);

System.out.println(s);
//7. to verify desire page open or not------------------------------------------
if(s.equals("Guru99 Bank Manager HomePage")){
	System.out.println("right Page");
}
else {
	System.out.println("wrong page");
}
//to get url value-------------------------------------------------------------
String url = driver.getCurrentUrl();
System.out.println(url);

//8. to get the text of Webelemnts----------------------------------------------------------------------------------------
List<WebElement> nuh = driver.findElements(By.xpath("//li[@class='dropdown']"));
for(WebElement er : nuh) {
	System.out.println(er.getText());
}

//10.to get the Attribute value(example link texts)-------------------------------------------------------------------------------------
List <WebElement> ty = driver.findElements(By.xpath("//a"));
for(WebElement ui :ty) {
System.out.println(ui.getAttribute("href"));
}

WebElement poiu = driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));

if(poiu.isDisplayed()) {
driver.close();

	}
else {
	System.out.println("not displaed");
}


// to Drag and Drop---------------------------------------------------------------------------------------------------------------
// driver.findElement(By.xpath("//a[contains(text(),'Selenium')][@class='dropdown-toggle']/..")).click();
// driver.findElement(By.xpath("//a[text()='Drag and Drop Action']")).click();
//try {
//	driver.switchTo().alert();
//	WebElement lkjhg= driver.findElement(By.xpath("//span[contains(@class,'ns-')][text()='Close']"));
//	driver.switchTo().frame(lkjhg);
//	lkjhg.click();
//}
//catch(Exception em) {
//	
//}
//Actions act = new Actions(driver);
//WebElement lkjh= driver.findElement(By.xpath("//a[@class='button button-orange'][contains(text(),'BANK')]"));
//WebElement lkjh1= driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']/li"));
//act.dragAndDrop(lkjh,lkjh1).perform();

}
}

