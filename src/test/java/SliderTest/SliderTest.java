package SliderTest;

import BaseIOSTest.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class SliderTest extends BaseIOSTest  {
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = DesiredCapabilities();
        driver.findElementByAccessibilityId("Sliders").click();
        IOSElement slider = (IOSElement) driver.findElementByXPath("//XCUIElementTypeSlider");
        slider.setValue("0%");
        slider.setValue("0.5%");
        Assert.assertEquals("100%",slider.getAttribute("value"));
    }
}
