package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://en-gb.facebook.com/");
				
				driver.manage().window().maximize();
			
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
				
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mothika");

				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SenthilKumar");
				
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("senthu.15551@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("1234567");
				
				WebElement dateWE = driver.findElement(By.xpath("//select[@name='birthday_day']"));
				Select date = new Select(dateWE);
				date.selectByIndex(24);
				
				WebElement monthWE = driver.findElement(By.xpath("//select[@name='birthday_month']"));
				Select month = new Select(monthWE);
				month.selectByValue("4");
				
				WebElement yearWE = driver.findElement(By.xpath("//select[@name='birthday_year']"));
				Select year = new Select(yearWE);
				year.selectByVisibleText("1986");	
				
				driver.findElement(By.xpath("(//input[@name ='sex'])[1]")).click();
				
				Thread.sleep(30000);
				
				driver.close();			
		
	}

}
