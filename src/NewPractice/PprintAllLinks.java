package NewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PprintAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/"); 
    List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
    int Count = AllLinks.size();
    System.out.println(Count);
	for(int i = 0; i <Count; i++) {
		WebElement Link = AllLinks.get(i);
		String Text = Link.getText();
		System.out.println(Text);
	}
      driver.close();
	}

}
