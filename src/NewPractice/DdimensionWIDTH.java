package NewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DdimensionWIDTH {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	int UN = driver.findElement(By.id("username")).getSize().getWidth();
	int PW = driver.findElement(By.name("pwd")).getSize().getWidth();
	if(UN == PW) {
		System.out.println("Length is equal");
	}
	else {
		System.out.println("Length is not equal");
	}
      driver.close();
	}

}
