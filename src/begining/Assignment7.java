package begining;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selinum Course udemy\\Revision\\ChromeEXE96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rows=driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> Column=driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[3]/td"));
		System.out.println(Column.size());
		
		for(int i=0;i<Column.size();i++)
		{
			System.out.print(Column.get(i).getText());
			System.out.print("\t");
		}
	}

}
