package seleniumtask4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Omrhotel1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		
		
	WebElement txtemail  =	driver.findElement(By.id("email"));	
	txtemail.sendKeys("gnanadvel25@gmail.com");
	WebElement EnterPass = driver.findElement(By.id("pass"));
	EnterPass.sendKeys("Gnanavel@25");
	WebElement ClickSubmit = driver.findElement(By.xpath("//button[@value='login']"));
	ClickSubmit.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement selectst = driver.findElement(By.id("state"));
	selectst.sendKeys("Tamil Nadu");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement selectcity = driver.findElement(By.id("city"));
	Select select1 = new Select(selectcity);
	select1.selectByIndex(2);
	WebElement clicktype = driver.findElement(By.xpath("//select[@id='room_type']"));
	Select select2 = new Select(clicktype);
	select2.selectByValue("Deluxe");
	
	WebElement slctdate = driver.findElement(By.name("check_in"));
	slctdate.click();
	//List<WebElement> allrows= (List<WebElement>) driver.findElement(By.tagName("tr"));
	//List<WebElement> alldatas = driver.findElements(By.tagName("td"));
	//WebElement slctdate1=(WebElement) driver.findElements(By.xpath("//input[@name='check_in']//a[text()='12']"));
	//slctdate1.click();
	List<WebElement> allRows = driver.findElements(By.tagName("tr"));
	List<WebElement> allDatas = driver.findElements(By.tagName("td"));
	WebElement slctDate = driver.findElement(By.xpath("//input[@name='check_in']//following::a[text()='12']"));
	slctDate.click();
	Thread.sleep(3000);
	
	WebElement slctdate2 = driver.findElement(By.name("check_out"));
	slctdate2.click();
	List<WebElement> allRows1 = driver.findElements(By.tagName("tr"));
	List<WebElement> allDatas1 = driver.findElements(By.tagName("td"));
	WebElement outDate = driver.findElement(By.xpath("//input[@name='check_out']//following::a[text()='14']"));
	outDate.click();
	
	WebElement slctnoofroom = driver.findElement(By.id("no_rooms"));
	Select select3 = new Select(slctnoofroom);
	select3.selectByIndex(3);
	WebElement slctadult = driver.findElement(By.id("no_adults"));
	Select select4 = new Select(slctadult);
	select4.selectByIndex(3);
	
	WebElement slctchild = driver.findElement(By.id("no_child"));
    slctchild.sendKeys("3");
    Thread.sleep(5000);
    driver.switchTo().frame("hotelsearch_iframe");
	WebElement prsSearch = driver.findElement(By.id("searchBtn"));
	prsSearch.click();
	driver.switchTo().defaultContent();
	
	  WebElement slcthotel = driver.findElement(By.xpath("//h5[text()='Select Hotel']"));
	    String text = slcthotel.getText();
	    System.out.println(text);
	    
	  WebElement chckprice = driver.findElement(By.xpath("//label[text()='Price low to high']"))  ;
	  chckprice.click();
	  
	  List<WebElement> price = driver.findElements(By.xpath("//strong[@class='total-prize']"));
	  for(WebElement order:price) {
		  System.out.println(order.getText());
	  }

	}

}
