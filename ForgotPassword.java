
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ForgotPassword {
	public static void  main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		WebElement customerLogin=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		builder.moveToElement(customerLogin).perform();
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[1]/a"));
		login.click();
		Thread.sleep(1000);
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
		forgotPasswordLink.click();
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.name("email_id"));
		email.sendKeys("22r01a0554@gmail.com");
		Thread.sleep(2000);
		WebElement login1=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/button"));
		login1.click();
		Thread.sleep(5000);
		driver.quit();
	}

}