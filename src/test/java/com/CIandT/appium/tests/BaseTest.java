package com.CIandT.appium.tests;

import com.CIandT.appium.utils.Utils;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class BaseTest {
    @Before
    public void setup() throws MalformedURLException {

        Utils.init();
            }

    @After
    public void tearDown() {
        Utils.quit();
    }
}
