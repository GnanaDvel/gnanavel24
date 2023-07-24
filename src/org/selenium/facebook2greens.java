package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook2greens {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement clickNewAcc = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		clickNewAcc.click();
		Thread.sleep(3000);
		WebElement txtEnterFirstName = driver .findElement(By.name("firstname"));
		txtEnterFirstName.sendKeys("gnanavel");
		WebElement txtEnterSecondName = driver.findElement(By.name("lastname"));
		txtEnterSecondName.sendKeys("GT");
		WebElement txtEnterEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		txtEnterEmail.sendKeys("gnanavelthala8@gmail.com");
		WebElement txtReEnter = driver.findElement(By.name("reg_email_confirmation__"));
		txtReEnter.sendKeys("gnanavelthala8@gmail.com");
		WebElement txtEnterPassword = driver.findElement(By.id("password_step_input"));
        txtEnterPassword.sendKeys("25/03/1997Gt");
        WebElement txtClickMale = driver.findElement(By.xpath("//label[text()='Male']"));
        txtClickMale.click();
        WebElement txtEnterDay = driver.findElement(By.id("day"));
        txtEnterDay.sendKeys("25");
        WebElement txtEnterMonth = driver.findElement(By.id("month"));
        txtEnterMonth.sendKeys("march");
        WebElement txtEnterYear = driver.findElement(By.id("year"));
        txtEnterYear.sendKeys("1997");
        WebElement clicksubmit = driver.findElement(By.name("websubmit"));
        clicksubmit.click();
        
	}

}
