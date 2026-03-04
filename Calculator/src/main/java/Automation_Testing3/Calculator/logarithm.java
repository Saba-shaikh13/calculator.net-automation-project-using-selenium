package Automation_Testing3.Calculator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logarithm {
	ChromeDriver driver;

	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	void log_1()
	{
		 driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(1)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(4)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();

		 
	}

	void log_2()
	{
		 driver.findElement(By.cssSelector("span[onclick='r(6)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(7)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(8)']")).click();
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(9)']")).click();
	}
	public static void main(String[] args) {
		logarithm obj=new logarithm();
		obj.launch();
		obj.log_1();
		obj.log_2();
	}
	
}
