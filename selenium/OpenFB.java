package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("8754507586");
		driver.findElement(By.id("pass")).sendKeys("Ch@ngep0nd2024");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(10000);
		
		//driver.close();
	}

}
