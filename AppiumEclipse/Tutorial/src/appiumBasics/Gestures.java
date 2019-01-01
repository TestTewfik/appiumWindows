package appiumBasics;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Gestures extends Base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Tap
		
		TouchAction t = new TouchAction(driver);
		
		WebElement ExpandableLists = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		t.tap(tapOptions().withElement(element(ExpandableLists))).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		//Long press (NE pas oublier import static)
		WebElement peopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
		
		
		
	}
	
	
	
	

}
