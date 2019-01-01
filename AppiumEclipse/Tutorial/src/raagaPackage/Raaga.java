package raagaPackage;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Raaga extends BaseRaaga{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		
		/*locator :
		 * 
		 * Skip1 = text SKIP
		 * skip2 = id = android:id/button2
		 * skip3 = text SKIP
		 * options classname : android.widget.ImageView
		 * text : Most Popular
			*/
		
		driver.findElementByAndroidUIAutomator("text(\"SKIP\")").click();
		
		//driver.findElementByAndroidUIAutomator("id(\"android:id/button2\")").click();
		driver.findElementById("android:id/button2").click();
		Thread.sleep(3000);
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElementByAndroidUIAutomator("text(\"SKIP\")").click();
		driver.findElementByAndroidUIAutomator("class(\"android.widget.ImageView\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Most Popular\")").click();
		
	}
}
