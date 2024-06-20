package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumSampleCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//To pause the execution
		Thread.sleep(1000);
		//To Close the browser
		driver.close();
		
		

	}

}
