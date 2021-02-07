package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSetup {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\vaishu SW QA\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.ca/");
	System.out.println("launch browser");
	
	int a=10,b=20,c;
	
	c=a+b;
	System.out.println(c);
	}

}
