import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class MercuryTourHeader {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		WebElement internationalHoliday = driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[1]/a"));
		internationalHoliday.click();
		Thread.sleep(3000);
		WebElement indianHoliday = driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[2]/a"));
		indianHoliday.click();
		Thread.sleep(3000);
		WebElement prefferedHoliday = driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[3]/a"));
		prefferedHoliday.click();
		Thread.sleep(3000);
		WebElement mice = driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[5]/a"));
		mice.click();
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		
		WebElement aboutus =	driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[10]/a"));
		builder.moveToElement(aboutus).perform();
		WebElement findbranch = driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[10]/ul/li[1]/a"));
		findbranch.click();
		Thread.sleep(2000);
		WebElement hotel = driver.findElement(By.xpath("/html/body/nav[3]/div/div/ul/li[7]/a"));
		hotel.click();
		Thread.sleep(10000);
		
		
		
		
	
		driver.quit();
	}

}
