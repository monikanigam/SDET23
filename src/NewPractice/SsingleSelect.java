package NewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SsingleSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.skyscanner.co.in/");
	driver.findElement(By.xpath("(//span[contains(@class,'DateInput')])[1]")).click();
	WebElement Month = driver.findElement(By.name("months"));
	Select s = new Select(Month);
	s.selectByIndex(9);
    Thread.sleep(5000);
    s.selectByValue("2021-09");
    Thread.sleep(5000);
    s.selectByVisibleText("June - 2022");
    driver.close();
    
	}

}
