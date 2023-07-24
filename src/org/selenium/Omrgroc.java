package org.selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omrgroc {

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
		
		WebElement AddData = driver.findElement(By.xpath("//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']"));
		AddData.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//WebElement pressCart = driver.findElement(By.xpath("//div[@class='cart_dropdown']"));
		//pressCart.click();
		WebElement AddressType = driver.findElement(By.id("address_type"));
		AddressType.sendKeys("Home");
		WebElement FirstName = driver.findElement(By.name("first_name"));
		FirstName.sendKeys("Gnanavel");
	    WebElement SecondName = driver.findElement(By.name("last_name"));
	    SecondName.sendKeys("vel");
	    WebElement ContactNo = driver.findElement(By.name("mobile"));
	    ContactNo.sendKeys("8610310032");
	    Thread.sleep(3000);
		WebElement House = driver.findElement(By.name("apartment"));
		House.sendKeys("25/03");
	    WebElement Address = driver.findElement(By.name("address"));
	    Address.sendKeys("chelliamman kovil street");
	    WebElement State = driver.findElement(By.name("state"));
	    State.sendKeys("Tamilnadu");
	    Thread.sleep(3000);
	    WebElement City = driver.findElement(By.name("city"));
	    City.sendKeys("Chennai");
	    WebElement Zip = driver.findElement(By.name("zipcode"));
	    Zip.sendKeys("604303");
	    WebElement Submit = driver.findElement(By.xpath("//button[@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']"));
	    Submit.click();
	    Thread.sleep(3000);
	    WebElement Card = driver.findElement(By.id("payment_type"));
	    Card.sendKeys("Debit");
	    WebElement visa = driver.findElement(By.xpath("//label[@for='visa_card']"));
	    visa.click();
	    WebElement cardno = driver.findElement(By.name("card_no"));
	    cardno.sendKeys("5555555555552222");
	    WebElement Month = driver.findElement(By.id("month"));
	    Month.sendKeys("March");
	    WebElement Year = driver.findElement(By.id("year"));
	    Year.sendKeys("2023");
	    WebElement Cvv = driver .findElement(By.name("cvv"));
	    Cvv.sendKeys("654");
	    Thread.sleep(3000);
	    WebElement Placeorder = driver.findElement(By.id("placeOrder"));
	    Placeorder.click();
	    WebElement Welcome = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
	    Welcome.click();
	    Thread.sleep(3000);
	    WebElement Acc = driver.findElement(By.xpath("//a[text()='My Account']"));
	    Acc.click();
	    WebElement Order = driver.findElement(By.id("v-pills-orders-tab"));
	    Order.click();
	    WebElement Detailedorder = driver.findElement(By.xpath("//a[@class='font16 colorTheme border1 radius50 px-3 py-1']"));
	    Detailedorder.click();
	    WebElement Gettext = driver.findElement(By.xpath("(//span[@class='font16 fontNormal color36'])[1]"));
	    String text = Gettext.getText();
	    System.out.println(text);





		
		
		

	}

}
