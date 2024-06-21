import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class Bus{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\91739\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/bus-tickets");
		Thread.sleep(5000);
		WebElement Holidaydestination = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[1]/label[1]/div/label/input[1]"));
		Holidaydestination.sendKeys("Hyderabad");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement Holidaydestination2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[1]/label[3]/div/label/input[1]"));
		Holidaydestination2.sendKeys("Chennai");
	
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[2]/label[1]/input"));
		date.click();
		Thread.sleep(500);
		WebElement datepick = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[2]/label[1]/div[1]/div[3]/div[2]/div[6]/div[7]"));
		datepick.click();
		Thread.sleep(500);
		WebElement date1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[2]/label[2]"));
		date1.click();
		Thread.sleep(500);
		WebElement datepick1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[2]/label[2]/div[1]/div[3]/div[2]/div[7]/div[1]"));
		datepick1.click();
		Thread.sleep(500);
		
		
		WebElement search = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[3]/div[4]/input[2]"));
		search.click();
		Thread.sleep(10000);
		WebElement Holidaydestination3 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/header/ul/li[3]/a"));
		Holidaydestination3.click();
		WebElement Holidaydestination4 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[4]/div[2]/label[1]/div/label/fieldset/select"));
		Holidaydestination4.click();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement dest = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[4]/div[2]/label[2]/div/label/fieldset/select"));
		dest.click();
	
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement date2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[4]/div[3]/label/input"));
		date2.click();
		Thread.sleep(500);
		WebElement datepick2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[4]/div[3]/label/div[1]/div[3]/div[2]/div[6]/div[6]"));
		datepick2.click();
		Thread.sleep(500);
		WebElement search1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[4]/div[4]/input[2]"));
		search1.click();
		Thread.sleep(10000);
		WebElement search2 = driver.findElement(By.xpath("/html/body/div[11]/div/ul/li[1]/div[1]/section[7]/button"));
		search2.click();
		Thread.sleep(10000);
		WebElement seat = driver.findElement(By.xpath("/html/body/div[11]/div/ul/li[1]/div[2]/div/div[1]/div/div/div[2]/div[5]/i[11]"));
		seat.click();
		Thread.sleep(3000);
		WebElement dest1 = driver.findElement(By.xpath("/html/body/div[11]/div/ul/li[1]/div[2]/div/div[2]/section[1]/fieldset/select"));
		dest1.click();
	
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement dest2 = driver.findElement(By.xpath("/html/body/div[11]/div/ul/li[1]/div[2]/div/div[2]/section[2]/fieldset/select"));
		dest2.click();
	
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement search3 = driver.findElement(By.xpath("/html/body/div[11]/div/ul/li[1]/div[2]/div/div[2]/section[3]/button"));
		search3.click();
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/label/select"));
		gender.click();
	
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/input"));
		name.sendKeys("poojitha");
		Thread.sleep(3000);
		WebElement age = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div[3]/input"));
		age.sendKeys("56");
		Thread.sleep(3000);
		WebElement number = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/input"));
		number.sendKeys("8977878888");
		Thread.sleep(3000);
		WebElement mail= driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/div/input"));
		mail.sendKeys("poojitha.31@gmail.com");
		Thread.sleep(3000);
		WebElement code= driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[3]/div[2]/div[1]/div[3]/div[2]/div/div/div/input[2]"));
		code.sendKeys("3556");
		Thread.sleep(3000);
		WebElement proceed= driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div/div/div[3]/div[2]/div[1]/div[3]/div[2]/div/div/div/input[2]"));
		proceed.click();
		Thread.sleep(10000);
		driver.quit();
		
	}

}
