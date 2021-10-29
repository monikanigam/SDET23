package NewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FfbLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    boolean Logo = driver.findElement(By.xpath("//img[contains(@class, 'fb_logo _8ilh img')]")).isDisplayed();
    if(Logo == true) {
    	System.out.println("Logo is enabled");
    }
    else {
    	System.out.println("Logo is not enabled");
    }
    driver.close();
	}

}
