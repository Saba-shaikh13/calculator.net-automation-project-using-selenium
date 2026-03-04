package Automation_Testing3.Calculator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
	ChromeDriver driver;

	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	void test_link() throws InterruptedException
	{
		List<WebElement> w1=driver.findElements(By.tagName("a"));
		for(WebElement li:w1)
		{
			System.out.println(li.getText());
			Thread.sleep(1000);
		}
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		links obj=new links();
		obj.launch();
		obj.test_link();
	}
}
