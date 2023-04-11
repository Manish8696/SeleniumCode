package SeleniumEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		WebElement menu = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).perform();
		WebElement mn = driver.findElement(By.xpath("//*[@class='dropdown-menu c-menu-type-inline']//li[5]"));
		mn.click();

	}

}
