package week1.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class leadCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Changepond Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Senthil Kumar");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Senthil Kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmanan");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(200000);
		
	}

}
