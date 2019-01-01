package appiumBasics;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DragDropDemo extends Base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction t = new TouchAction(driver);

		
		WebElement element1 = driver.findElementsByClassName("android.view.View").get(0);
		WebElement element2 = driver.findElementsByClassName("android.view.View").get(1);
		
		t.longPress(longPressOptions().withElement(element(element1)).withDuration(ofSeconds(2)))
		.moveTo(element(element2))
		.release().perform();
		
		
		
	}
	
	
	
	

}
