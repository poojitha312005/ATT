import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class Home1{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		WebElement flight = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[1]/ul/li[2]/a"));
		flight.click();
		Thread.sleep(2000);
		WebElement Holidaydestination = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[1]/form/div/div/div/div[2]/div[1]/div[1]/input"));
		Holidaydestination.sendKeys("Hyderabad");
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement Holidayto = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[1]/form/div/div/div/div[2]/div[1]/div[2]/input"));
		Holidayto.sendKeys("Chennai");
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[1]/form/div/div/div/div[2]/div[4]/div/div/button"));
		search.click();
		Thread.sleep(5000);
		
		
		
		
	
		driver.quit();
	}

}
