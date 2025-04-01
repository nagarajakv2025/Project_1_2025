package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertiesFilepractice {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("U:\\SDET\\Selenium\\CommonTestData1.proprties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("url");
		String UN = prop.getProperty("username");
		String PWD = prop.getProperty("password");
		driver.get(value);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(UN, Keys.TAB, PWD, Keys.ENTER);
		

	}

}
