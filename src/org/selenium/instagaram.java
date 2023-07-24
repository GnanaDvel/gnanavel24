package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class instagaram {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page \r\n"
				+ "");
		driver.manage().window().maximize();
		WebElement txtUserName= driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d'][1]"));
	    txtUserName.sendKeys("GNANAVEL");
	    WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d'][2]"));
	    txtPassword.sendKeys("253068");

	}

}
