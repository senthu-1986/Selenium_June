package week2.day3;

public class LoginTestData extends TestData {
	public void enterUsername() 
	{
		System.out.println("Please enter the username");
	}
	public void enterPassword() 
	{
		System.out.println("Please enter the password");
	}
	public static void main (String[] args) 
	{
		LoginTestData logindata = new LoginTestData();
		logindata.enterCredentials();
		logindata.navigateToHomePage();
		logindata.enterUsername();
		logindata.enterPassword();
		
	
	}
}
