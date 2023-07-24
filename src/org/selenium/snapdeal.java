package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class snapdeal {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		WebElement txtEnterNumber = driver.findElement(By.id("userName"));
		txtEnterNumber.sendKeys("9856476323");
		driver.quit();

	}

}
