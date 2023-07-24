package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Automationprac {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement prsClick = driver.findElement(By.xpath("//input[@class='btn btn-primary-shadow btn-block']"));
		prsClick.click();

	}

}
