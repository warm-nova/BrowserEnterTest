package teneras.david.browserentertest;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;


import org.junit.Test;
import org.junit.runner.RunWith;
import junit.framework.Assert;

/**
 * Created by lidecai on 2015/11/26.
 */
@RunWith(AndroidJUnit4.class)

public class UiTest extends AbstractTestCase{

    @Test
    public void testOpenBrowser() throws UiObjectNotFoundException
    {
        openApp("360浏览器",0);
    }

    @Test
    public void testenterAddr() throws UiObjectNotFoundException
    {
        openApp("360浏览器",0);
    }


}
