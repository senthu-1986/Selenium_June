package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]")).sendKeys("Changepond Technologies");
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Senthil Kumar");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Lakshmanan");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstNameLocal']")).sendKeys("Senthu");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_description']")).sendKeys("How are You");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("senthu.15551@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state_data = new Select(state);
		state_data.selectByVisibleText("New York");
		
		
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement clearButton = driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_description']"));
		clearButton.clear();
		driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_importantNote']")).sendKeys("Hope it is Clear");
		driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("The Title of the page is " +title);
		Thread.sleep(10000);
		driver.close();
	}

}
