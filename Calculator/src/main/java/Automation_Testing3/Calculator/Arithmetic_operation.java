package Automation_Testing3.Calculator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arithmetic_operation {
	
		ChromeDriver driver;
		void launch()
		{
			driver=new ChromeDriver();
			driver.get("https://www.calculator.net/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		void Add()
		{
		 driver.findElement(By.cssSelector("span[onclick='r(7)']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(9)']")).click();
		 driver.findElement(By.xpath("//span[text()='=']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		}
		void Sub()
		{
			 driver.findElement(By.cssSelector("span[onclick='r(8)']")).click();
			 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
			 driver.findElement(By.xpath("//span[text()='=']")).click();
			 driver.findElement(By.xpath("//span[text()='AC']")).click();
		}
		void mul()
		{
			 driver.findElement(By.cssSelector("span[onclick='r(9)']")).click();
			 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
			 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
			 driver.findElement(By.xpath("//span[text()='=']")).click();
			 driver.findElement(By.xpath("//span[text()='AC']")).click();
		}
		void division()
		{
			 driver.findElement(By.cssSelector("span[onclick='r(8)']")).click();
			 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
	         driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
	         driver.findElement(By.xpath("//span[text()='=']")).click();
			 driver.findElement(By.xpath("//span[text()='AC']")).click();

			 

		}
		

		public static void main(String[] args) {
			Arithmetic_operation obj=new Arithmetic_operation();
			obj.launch();
			obj.Add();
			obj.Sub();
			obj.mul();
			obj.division();
		}
	}


