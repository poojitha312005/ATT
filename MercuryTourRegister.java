import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class MercuryTourRegister {

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.mercurytravels.co.in/");
			Thread.sleep(2000);
			
			Actions builder = new Actions(driver);
		
			WebElement customerLogin =	driver.findElement(By.xpath("(//a[@class='dropdown-toggle'][normalize-space()='Customer Login'])[2]"));
			builder.moveToElement(customerLogin).perform();
			WebElement register = driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Register'])[2]"));
			register.click();
			Thread.sleep(2000);
			WebElement firstName = driver.findElement(By.xpath("(//input[@id='acc_first_name'])[1]"));
			firstName.sendKeys("poojitha");
			Thread.sleep(500);
			
			WebElement lastName = driver.findElement(By.xpath("(//input[@id='acc_last_name'])[1]"));
			lastName.sendKeys("reddy");
			Thread.sleep(500);
			
			WebElement emailId = driver.findElement(By.xpath("(//input[@id='acc_user_email'])[1]"));
			emailId.sendKeys("poojitha678@gmail.com");
			Thread.sleep(500);
			WebElement setPassword = driver.findElement(By.xpath("(//input[@id='acc_user_password'])[1]"));
			setPassword.sendKeys("ashu123");
			Thread.sleep(500);
			
			WebElement confirmPassword = driver.findElement(By.xpath("(//input[@id='acc_user_passconf'])[1]"));
			confirmPassword.sendKeys("ashu123");
			Thread.sleep(500);
			
			WebElement mobileNumber = driver.findElement(By.xpath("(//input[@id='acc_mobile_no'])[1]"));
			mobileNumber.sendKeys("8788909899");
			Thread.sleep(500);
			
			WebElement registerBtn = driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]"));
			registerBtn.click();
			Thread.sleep(5000);
			driver.close();
			

		}
		
		


}
