package com.CIandT.appium;

import com.CIandT.appium.utils.Utils;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class BaseTest {
    @Before
    public void setup() throws MalformedURLException {
        System.out.println("Entrou no setup");
        Utils.init();
        System.out.println("Finalizou before");
    }

    @After
    public void tearDown() {
        Utils.quit();
    }
}
