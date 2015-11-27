package teneras.david.browserentertest;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import junit.framework.Assert;

/**
 * Created by lidecai on 2015/11/26.
 */
public class AbstractTestCase {

    public void openApp(String appName, int apptype) throws UiObjectNotFoundException
    {
        UiDevice device=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
        UiObject appObject=device.findObject(new UiSelector().text(appName));
        appObject.clickAndWaitForNewWindow();
        String packageNameString = device.getCurrentPackageName();

        if (apptype == 0)
            Assert.assertEquals("Opened Apps:", "com.qihoo.browser", packageNameString);
        if (apptype == 1)
            Assert.assertEquals("Opened Apps:", "com.qihoo.freebrowser", packageNameString);
    }

    public void enterAddr(String netAddr,int apptype) throws UiObjectNotFoundException
    {
        if(apptype==0)
        {
            UiDevice device=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            UiObject editobject=device.findObject(new UiSelector().resourceId("com.qihoo.browser:id/urlbar_urltext"));
        }
    }

}
