package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myntra {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement txtEnter = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtEnter.sendKeys("8610310032");
		WebElement prsClick = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		prsClick.click();
		//driver.quit();

	

	}

}
