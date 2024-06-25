package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("My Data_3");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industry_data = new Select(industry);
		industry_data.selectByIndex(3);
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select Ownership_data = new Select(Ownership);
		Ownership_data.selectByVisibleText("S-Corporation");
		WebElement marketingCampaign = driver.findElement(By.name("marketingCampaignId"));
		Select marketingCampaign_data = new Select(marketingCampaign);
		marketingCampaign_data.selectByValue("9000");
		WebElement selectState = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select State_data = new Select(selectState);
		State_data.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class ='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println("The Title is " +title);
		
		
	}

}
