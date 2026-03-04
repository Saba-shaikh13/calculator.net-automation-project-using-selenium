package Automation_Testing3.Calculator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class calci_fun {
	ChromeDriver driver;

	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	void fun1()
	{
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[3]/span[1]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[3]/span[2]")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 
		 driver.findElement(By.cssSelector("span[onclick='r(8)']")).click();
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[3]/span[3]")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 
			
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[3]/span[4]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();	
		 
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[3]/span[5]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();	
		 
		 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[1]")).click();
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();	
		 
		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[2]")).click();
		 driver.findElement(By.xpath("//span[text()='AC']")).click();	

		 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
			driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[3]")).click();
			 driver.findElement(By.xpath("//span[text()='AC']")).click();	

			 driver.findElement(By.cssSelector("span[onclick='r(3)']")).click();
				driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[4]")).click();
				 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
				 driver.findElement(By.xpath("//span[text()='AC']")).click();	

				 driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[5]/span[1]")).click();
				 driver.findElement(By.cssSelector("span[onclick='r(7)']")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
				 driver.findElement(By.cssSelector("span[onclick='r(9)']")).click();
				 driver.findElement(By.xpath("//span[text()='AC']")).click();	

				 
				 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
					driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[5]/span[3]")).click();
					 driver.findElement(By.xpath("//span[text()='AC']")).click();	

					 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
						driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[5]/span[4]")).click();
						 driver.findElement(By.xpath("//span[text()='AC']")).click();	

						 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
							driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[5]/span[5]")).click();
							 driver.findElement(By.xpath("//span[text()='AC']")).click();	
							 
								driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[2]")).click();
								 driver.findElement(By.xpath("//span[text()='AC']")).click();
								 
								 
								 driver.findElement(By.cssSelector("span[onclick='r(7)']")).click();
								 driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
							 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
							driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[1]")).click();
							 driver.findElement(By.xpath("//span[text()='AC']")).click();	
							 
									 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
										driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[3]")).click();
										 driver.findElement(By.cssSelector("span[onclick='r(7)']")).click();
										 driver.findElement(By.xpath("//span[text()='AC']")).click();	
										 

										 driver.findElement(By.cssSelector("span[onclick='r(1)']")).click();
											driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[2]")).click();
											 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
										 driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
									 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
									 driver.findElement(By.xpath("//span[text()='AC']")).click();	


										 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
											driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[5]")).click();
											 driver.findElement(By.xpath("//span[text()='AC']")).click();
												driver.findElement(By.xpath("//*[@id=\"scimrc\"]")).click();
												 driver.findElement(By.xpath("//span[text()='AC']")).click();



												 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
													driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[5]")).click();
													 driver.findElement(By.xpath("//span[text()='AC']")).click();
											 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
												driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[5]")).click();
												driver.findElement(By.xpath("//*[@id=\"scimrc\"]")).click();
												 driver.findElement(By.xpath("//span[text()='AC']")).click();
												 
												 driver.findElement(By.cssSelector("span[onclick='r(5)']")).click();
												 driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
											 driver.findElement(By.cssSelector("span[onclick='r(2)']")).click();
													driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[5]")).click();
													 driver.findElement(By.xpath("//span[text()='AC']")).click();
													 
													 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
													 
	}
	        public static void main(String[] args) {
		    calci_fun obj=new calci_fun();
		    obj.launch();
		    obj.fun1();
	}
}
