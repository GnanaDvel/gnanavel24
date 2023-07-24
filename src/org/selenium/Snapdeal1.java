package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Snapdeal1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement prsClick = driver.findElement(By.xpath("//div[@class='accountInner']"));
		prsClick.click();
		WebElement txtEnter = driver.findElement(By.id("userName"));
		txtEnter.sendKeys("8610310032");
		

	}

}
