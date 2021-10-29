package NewPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	System.out.println("Hii Hemant");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.close();

	}

}
