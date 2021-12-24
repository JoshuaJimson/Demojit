package begining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selinum Course udemy\\Revision\\ChromeEXE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());

	}

}
