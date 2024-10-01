package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calenderpick {
	
	public static void main(String arg [])
	{
		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://magento.softwaretestingboard.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Sign In")).click();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		String Month = driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(Month);
		String Year = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(Year);
		while(!(Month.equals("April")&&Year.equals("2025")))
		{
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			Month = driver.findElement(By.className("ui-datepicker-month")).getText();
			Year = driver.findElement(By.className("ui-datepicker-year")).getText();
	
		}
		driver.findElement(By.xpath("//a[text()=\"16\"]")).click();
		
	}
	
	
}

