package BaseIOSTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {
   public static void main(String[] args) throws MalformedURLException {

      DesiredCapabilities capabilities = new DesiredCapabilities();

      capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
      capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 12 Pro");
      capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
      capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
      capabilities.setCapability("commandTimeouts","12000");
      capabilities.setCapability(MobileCapabilityType.APP, "/Users/ekaterinavolobchenko/Library/Developer" +
              "/Xcode/DerivedData/UIKitCatalog-gfqsjfoddmuxlyaoxvhaitcyngeo/Build/Products/Debug-iphonesimulator" +
              "/UIKitCatalog.app");

      URL url = new URL("http://localhost:4723/wd/hub");
      IOSDriver driver = new IOSDriver(url,capabilities);
      String sessionId = driver.getSessionId().toString();
   }
}
