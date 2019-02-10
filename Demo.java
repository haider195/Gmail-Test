package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hyder\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("hhhhhh11950@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("RveJvd snByac"));
		driver.findElement(By.name("password")).sendKeys("pakistan195");
		
		driver.findElement(By.className("CwaK9")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("aic")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("vO")).sendKeys("tselenium753@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("aoT")).sendKeys("Selenium");
		
		driver.findElement(By.className("Am")).sendKeys("Hi this is world");
		
		driver.findElement(By.className("aoO")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("gbii")).click();
		
		driver.findElement(By.id("gb_71")).click();
		
		
		String at = driver.getTitle();
		String et = "gmail";
		//driver.close();
		if(at.equalsIgnoreCase(et));
		{
			System.out.println("Test Successful");
		}
			
		}
	}
