package begining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selinum Course udemy\\Revision\\ChromeEXE96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.id("confirmbtn")).getAttribute("class")
		//.getAttribute will return the value of the particular attribute of the selected webelement
		
		System.out.println(driver.findElement(By.id("confirmbtn")).getAttribute("class"));
		System.out.println(driver.findElement(By.id("confirmbtn")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("confirmbtn")).getAttribute("onclick"));
		System.out.println(driver.findElement(By.id("confirmbtn")).getAttribute("type"));
	}

}
