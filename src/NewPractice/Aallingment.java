package NewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aallingment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	int UNX = driver.findElement(By.id("username")).getLocation().getX();
	int PWX = driver.findElement(By.name("pwd")).getLocation().getX();
	if (UNX == PWX) {
		System.out.println("Allingment is same");
	}
	else {
		System.out.println("Allingment is different");
	}
	driver.close();
	}

}
