package begining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selinum Course udemy\\Revision\\ChromeEXE96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] names = { "Brinjal", "Potato" };
		int c = 0, climit = names.length;
		// in future if we need to search for more options we just need to add
		// the element to this array , thats why we created the array
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		List neededlist = Arrays.asList(names);
		// converting array to list
		// we could have created a array list in the begning it self but it
		// takes more memmory.
		for (int i = 0; i < products.size(); i++) {

			String[] namesinsite = products.get(i).getText().split("-");
			namesinsite[0] = namesinsite[0].trim();
			// the text from the site will be like "Brinjal - 1 Kg". This will
			// not match the content in the array which we craeted thats why we
			// did the above two steps

			if (neededlist.contains(namesinsite[0])) {
				c++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}

			// namukk 2 item matram search cheytha mathiyenkil pinnem loop
			// kedann karanganda avashyam illallo...
			if (c == climit) {
				break;
			}

		}

	}

}
