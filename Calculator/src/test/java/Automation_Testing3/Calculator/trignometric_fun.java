package Automation_Testing3.Calculator;

import java.time.Duration;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class trignometric_fun {
	ChromeDriver driver;
	
	@Test (priority=1) 
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test (priority=2)
	void sine()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();		 
	}
	@Test(priority=3)
	void cos()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[2]")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(6)']")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
	    driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	}
	@Test(priority=4)
	void tan()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[3]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(4)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();

	}
	@Test(priority=5)
	void asine()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[1]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(6)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();		 
	}
	@Test(priority=6)
	void acos()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[2]")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
	    driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	}@Test(priority=7)
	void atan()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[3]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(4)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
	}
}
