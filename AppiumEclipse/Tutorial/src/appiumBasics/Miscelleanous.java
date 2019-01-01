package appiumBasics;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscelleanous extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		System.out.println("currentActivity :" + driver.currentActivity());
		System.out.println("context = " + driver.getContext()); // views : native, hybrid,webview
		System.out.println("Orientation = " + driver.getOrientation());
		System.out.println("is locked =" + driver.isDeviceLocked());
		// driver.hideKeyboard();

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		Thread.sleep(3000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		
		
		
		
		
		

	}

}
