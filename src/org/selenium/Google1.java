package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement txtEnter = driver.findElement(By.id("firstName"));
		txtEnter.sendKeys("GNANA");
		WebElement txtsec = driver.findElement(By.id("lastName"));
		txtsec.sendKeys("vel");
		WebElement txtId = driver.findElement(By.id("username"));
		txtId.sendKeys("Gnanavel258");
		WebElement txtPassw = driver.findElement(By.xpath("//input[@type='password'][1]"));
		txtPassw.sendKeys("2530333");
		WebElement txtPasswc = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtPasswc.sendKeys("2530333");
		WebElement prsClick = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb'][2]"));
		prsClick.click();

	}

}
