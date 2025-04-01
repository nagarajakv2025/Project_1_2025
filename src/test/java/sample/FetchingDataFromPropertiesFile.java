package sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException{
		
/*		FileInputStream fis = new FileInputStream("U:\\SDET\\Selenium\\CommonTestData.proprties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("url");
		String UN = prop.getProperty("username");
		String PWD = prop.getProperty("password");
*/		
		WebDriver driver = new ChromeDriver();
		PropertiesUtility pUtil = new PropertiesUtility();
		String value = pUtil.getDataFromPropertiesFile("url");
		driver.get(value);

		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");

		// Find the email input and send the username
		WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
		emailInput.sendKeys(UN);

		// Find the password input and send the password
		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
		passwordInput.sendKeys(PWD);

		// Press Enter to submit the form
		passwordInput.sendKeys(Keys.ENTER);

		
		

	}

}
