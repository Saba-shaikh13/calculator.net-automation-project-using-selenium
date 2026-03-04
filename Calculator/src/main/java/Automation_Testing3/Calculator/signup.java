package Automation_Testing3.Calculator;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;


public class signup {
		ChromeDriver driver;
		void launch()
		{
			driver=new ChromeDriver();
			driver.get("https://www.calculator.net/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}
		
		void sign_up()
		{
			driver.findElement(By.partialLinkText("sign in")).click();	
		    driver.findElement(By.linkText("Create a free account")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[1]/td/input")).sendKeys("abc");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[2]/td/input")).sendKeys("abc@gmail.com");
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12345");
			driver.findElement(By.cssSelector("input[name='password2']")).sendKeys("12345");
			driver.findElement(By.cssSelector("input[name='agreeterm']")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[7]/td/p/input[1]")).click();
//			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[7]/td/p/input[2]")).click();


		}
		
		public static void main(String[] args)  {
			signup obj =new signup();
			obj.launch();
			obj.sign_up();
		}
	}


