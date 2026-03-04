package Automation_Testing3.Calculator;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class trignometric {
ChromeDriver driver;
	

	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	void sine()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();		 
	}
	
	void cos()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[2]")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(6)']")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
	    driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	}
	
	void tan()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[3]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(4)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();

	}
	
	void asine()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[1]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(6)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();		 
	}
	
	void acos()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[2]")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
	    driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
	    driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	}
	void atan()
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[3]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(4)']")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
	}
	public static void main(String[] args) {
		trignometric obj=new trignometric();
		obj.launch();
		obj.sine();
		obj.cos();
		obj.tan();
		obj.asine();
		obj.acos();
		obj.atan();
				
	}

}
