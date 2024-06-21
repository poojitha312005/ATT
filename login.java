
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class login {
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
		WebElement email=driver.findElement(By.name("user_email"));
		email.sendKeys("22r01a0554@gmail.com");
		Thread.sleep(2000);
		WebElement set=driver.findElement(By.name("user_password"));
		set.sendKeys("Abcdefghi@1");
		Thread.sleep(2000);
		WebElement login1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/button"));
		login1.click();
		Thread.sleep(5000);
		driver.quit();
}
}