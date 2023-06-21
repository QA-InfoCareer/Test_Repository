package Session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itspi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		String text = driver.getTitle();
		System.out.println(text);

	}

}
