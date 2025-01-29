package introduction;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class selintroduction {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//System.out.println(driver.getTitle());

	}

}
