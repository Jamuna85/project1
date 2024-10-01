package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	
	public static void main(String arg [])
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("ZIP file")).click();
		//selenium pratice websites
		//https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/
		//https://candymapper.com/
		//https://candymapper.com/m/login?r=%2Fjoin-us
		

}
}
