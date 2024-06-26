package week2.day3;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("Incognito is launched successfully");
	}
	public void clearCache()
	{
		System.out.println("Cache is cleared successfully");
	}
	public static void main (String[] args)
	{
		Chrome device = new Chrome();
		device.clearCache();
		device.closeBrowser();
		device.navigateBack();
		device.openIncognito();
		device.openURL();
		System.out.println("Name of the Browser is :" +device.browserName);
		System.out.println("Browser version is :" +device.browserVersion);
	}
}
