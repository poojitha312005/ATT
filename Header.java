import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class Header {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/hotels");
		Thread.sleep(5000);
		WebElement Holiday = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[4]/a"));
		Holiday.click();
		Thread.sleep(3000);
		WebElement bus = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[5]/a"));
		bus.click();
		Thread.sleep(3000);
		WebElement cab = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[6]/a"));
		cab.click();
		Thread.sleep(3000);
		WebElement forex = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[7]/a"));
		forex.click();
		Thread.sleep(3000);
		WebElement support = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[6]/a"));
		support.click();
		Thread.sleep(3000);
		WebElement offers = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[5]/a"));
		offers.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
	
		driver.quit();
	}

}
