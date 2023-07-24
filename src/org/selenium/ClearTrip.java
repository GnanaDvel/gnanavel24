package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClearTrip {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement txtEnter = driver.findElement(By.id("from_station"));
		txtEnter.sendKeys("CHENNAI");
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("ANDHRA");
		WebElement prsClick = driver .findElement(By.id("trainFormButton"));
		prsClick.click();
		driver.quit();


	}

}
