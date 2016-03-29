package com.chuck.androiduitest;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by admin on 2016/3/29.
 */
public class AndroidUITest extends UiAutomatorTestCase {
    public void testDemo() throws UiObjectNotFoundException {
        getUiDevice().pressHome();
        UiObject Calculator = new UiObject(new UiSelector().text("计算器"));

        Calculator.clickAndWaitForNewWindow();
        UiObject clear = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/clear"));
        clear.click();
        UiObject seven = new UiObject(new UiSelector().text("7"));
        seven.click();
        UiObject plus = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/plus"));
        plus.click();
        UiObject one = new UiObject(new UiSelector().text("1"));
        one.click();
        UiObject result = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/equal"));
        result.click();
        getUiDevice().pressBack();
    }
}
