package Automation_Testing3.Calculator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {
	ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	void sign_in()
	{
		driver.findElement(By.partialLinkText("sign in")).click();	
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[4]/td/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[4]/td/input[2]")).click();

	}
	void forgot()
	{
		driver.findElement(By.partialLinkText("sign in")).click();
	    driver.findElement(By.linkText("Forget password?")).click();
	    

	}
	void search()
	{
		driver.findElement(By.id("calcSearchTerm")).sendKeys("math");
	}
	public static void main(String[] args) {
		signin obj = new signin();
		obj.launch();
//		obj.sign_in();
//		obj.forgot();
		obj.search();
		
	}
}
