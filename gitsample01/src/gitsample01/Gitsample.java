package gitsample01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gitsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Amal\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.Exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Facebook.com/");

	}

}
