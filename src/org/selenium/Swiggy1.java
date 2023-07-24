package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Swiggy1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.swiggy.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		WebElement prsClick = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		prsClick.click();
		WebElement txtEnternum = driver.findElement(By.id("mobile"));
		txtEnternum.sendKeys("9629762227");
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("Gnanavel");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Gnanadvel25@gmail.com");
		WebElement prsCont = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		prsCont.click();
		//driver.quit();
		
		
		

	}

}
