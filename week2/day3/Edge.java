package week2.day3;

public class Edge extends Browser {
	public void takeSnap() 
	{
		System.out.println("Snap is launched successfully");
	}
	public void clearCookies() 
	{
		System.out.println("Cookies is cleared successfully");
	}
	public static void main (String[] args)
	{
		Edge versionData = new Edge ();
		versionData.takeSnap();
		versionData.clearCookies();
		versionData.navigateBack();
		versionData.closeBrowser();
		versionData.openURL();
	}
}
