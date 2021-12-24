package begining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinum Course udemy\\Revision\\ChromeEXE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abu@makri.com");
		driver.findElement(By.id("pass")).sendKeys("abccd");
		driver.findElement(By.cssSelector("input#email")).sendKeys("937816471982");
		//driver.findElement(By.cssSelector("button[name='login']")).click();inputtext _9o1w
		driver.findElement(By.className("_6ltj")).click();
		
		
		

	}

}
