import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class Home2{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		WebElement hotel = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[1]/ul/li[3]/a"));
		hotel.click();
		Thread.sleep(5000);
		WebElement Holidaydestination = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/div/input[1]"));
		Holidaydestination.sendKeys("Hyderabad");
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div[2]/div[1]/input"));
		date.click();
		Thread.sleep(500);
		WebElement datepick = driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/tbody/tr[5]/td[7]"));
		datepick.click();
		Thread.sleep(500);
		WebElement search = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div[4]/div/div/button"));
		search.click();
		Thread.sleep(5000);
		
		
		
		
	
		driver.quit();
	}

}
