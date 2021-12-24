package begining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinum Course udemy\\Revision\\ChromeEXE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
