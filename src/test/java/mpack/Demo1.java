package mpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		

	}

}
