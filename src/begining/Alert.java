package begining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selinum Course udemy\\Revision\\ChromeEXE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Joshua");
		driver.findElement(By.cssSelector("#alertbtn")).click();

		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

	}

}
