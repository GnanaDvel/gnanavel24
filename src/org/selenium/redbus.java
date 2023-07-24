package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class redbus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get( " https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("pondy");
		//driver.quit();

	}

}
