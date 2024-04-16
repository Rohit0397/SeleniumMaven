
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		// Add comment
	}

}
