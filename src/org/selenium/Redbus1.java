package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Redbus1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in/\r\n"
				+ "");
		driver.manage().window().maximize();
		WebElement prsClick = driver.findElement(By.id("signin-block"));
		prsClick.click();
		WebElement txtEnternum = driver.findElement(By.id("smsTXTBOX"));
		txtEnternum.sendKeys("8610310032");
		WebElement prsEnter = driver.findElement(By.id("sendLinkButton"));
		prsEnter.click();

	}

}
