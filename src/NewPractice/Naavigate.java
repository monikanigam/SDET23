package NewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naavigate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.get("https://www.gmail.com/");
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.close();

	}

}
