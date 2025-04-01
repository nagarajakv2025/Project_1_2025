package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class POMPractice {
	
	@FindBy(xpath="//input[@name='user_name']") WebElement element;
	
	public POMPractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.navigateToApplication(driver, "http://localhost:8888/index.php?action=index&module=Home");
		sUtil.maximaizewindow(driver);
		sUtil.maximaizewindow(driver);
		sUtil.implicitWait(driver, 15);
		Thread.sleep(2000);
		//WebElement element = driver.findElement(By.xpath("//input[@name='user_name']"));
		POMPractice p = new POMPractice(driver);
		p.element.sendKeys("Avinash");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.element.sendKeys("Avinash");
	
	}

}
