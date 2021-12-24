package begining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinum Course udemy\\Revision\\ChromeEXE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByIndex(3);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByIndex(0);
		System.out.println(s.getFirstSelectedOption().getText());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		

	}

}
