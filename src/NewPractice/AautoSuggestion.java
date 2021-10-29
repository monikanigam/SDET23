package NewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AautoSuggestion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	// Open Chrome Browser
	WebDriver driver = new ChromeDriver();
	//Open Google.com
	driver.get("https://www.google.com/");
	// Type Java in seacrh Text Box 
	driver.findElement(By.name("q")).sendKeys("Java");
	Thread.sleep(5000);
	//Find all the auto suggestion and print count of auto suggestion
	 List<WebElement> AllSugg = driver.findElements(By.xpath("//span[contains(text(),'Java')]"));
	 int Count = AllSugg.size();
	 //Print the text of auto suggestion
	 System.out.println(Count);
	 for(int i=0; i<Count; i++) {
		 String Text = AllSugg.get(i).getText();
		 System.out.println(Text);
	 }
	 //Select the first auto suggestion
	 AllSugg.get(0).click();
	 driver.close();
	 
	
	

	}

}
