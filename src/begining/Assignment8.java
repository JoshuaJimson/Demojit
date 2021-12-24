package begining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selinum Course udemy\\Revision\\ChromeEXE96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(3000);
		String text="";
		while(!text.contains("USA"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

			   text=driver.findElement(By.id("autocomplete")).getAttribute("value"); 
		}
		System.out.println(text);

	}

}
