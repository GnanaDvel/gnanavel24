package seleniumtask4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class omr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		WebElement EnterEmail = driver.findElement(By.id("email"));
		EnterEmail.sendKeys("gnanadvel25@gmail.com");
		WebElement EnterPass = driver.findElement(By.id("pass"));
		EnterPass.sendKeys("Gnanavel@25");
		WebElement ClickSubmit = driver.findElement(By.xpath("//button[@value='login']"));
		ClickSubmit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Searchbar = driver.findElement(By.id("search"));
		Searchbar.sendKeys("Nuts",Keys.ENTER);
		WebElement AddToCart = driver.findElement(By.xpath("//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']"));
		AddToCart.click();
		WebElement Choose1 = driver.findElement(By.id("cart-21"));
		Choose1.click();
		Thread.sleep(4000);

		WebElement GoToCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		GoToCart.click();
		
		
		
		
		
		

	}

}
