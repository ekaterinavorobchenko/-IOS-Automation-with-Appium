package BaseIOSTest;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {
   public static IOSDriver DesiredCapabilities() throws MalformedURLException {

      DesiredCapabilities capabilities = new DesiredCapabilities();

      capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
      capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
      capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 12 Pro");
      capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
      capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
      capabilities.setCapability("commandTimeouts","12000");
      capabilities.setCapability(MobileCapabilityType.APP, "/Users/ekaterinavolobchenko/Library/Developer" +
              "/Xcode/DerivedData/longtap-cibktpwbaeyrfrgplccsbijsuqoa/Build/Products/Debug-iphonesimulator" +
              "/longtap.app");

      URL url = new URL("http://0.0.0.0:4723/wd/hub");
      IOSDriver driver = new IOSDriver(url,capabilities);
      return driver;
   }
}
