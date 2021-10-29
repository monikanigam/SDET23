package NewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	if (title.equals("Google")) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	String url = driver.getCurrentUrl();
	if (url.contains("google.co.in")) {
		System.out.println("Url is correct");
	}
	
	else {
		System.out.println("Url is incorrect");
	}
		driver.close();
	}
}
