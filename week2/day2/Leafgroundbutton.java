package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver .get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		String title = driver.getTitle();
		System.out.println("The Title of the page is " +title);
		
		driver .get("https://leafground.com/button.xhtml");
		WebElement buttonDisabled = driver.findElement(By.name("j_idt88:j_idt92"));
		Boolean disabledButton = buttonDisabled.isEnabled();
		System.out.println("The button is Disabled " +disabledButton);
		
		WebElement buttonSubmit = driver.findElement(By.xpath("//span[text() = 'Submit']"));
		org.openqa.selenium.Point submitButton = buttonSubmit.getLocation();
		System.out.println("Location of the Button is  " +submitButton);
		
		
		WebElement saveColour = driver.findElement(By.xpath("//span[text() = 'Save']"));
		String Colour = saveColour.getCssValue("background-color");
		System.out.println("Colour of the Button is  " +Colour);
		
		WebElement heightWidth = driver.findElement(By.name("j_idt88:j_idt98"));
		Dimension width = heightWidth.getSize();
		System.out.println("Height and Width of the Button is  " +width);
		
	}

}
