package com.CIandT.appium.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Utils {
    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;
    public enum Platform {
        ANDROID,IOS
    }
    public static String getPlatform() {
        String env = System.getProperty("platform");
        if (env != null) {
            return env.toUpperCase();
        } else {
            //Assert.fail("Platform not defined. \n Example: -Dplatform:ANDROID");
            return "ANDROID";
        }
    }

    public static URL getUrlAppium() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static void init() throws MalformedURLException {
        Platform platform = Platform.valueOf(getPlatform());
        System.out.println("platform = " + platform);
        DesiredCapabilities configuracoes = new DesiredCapabilities();

        switch (platform) {
            case IOS:
                System.out.println("IOS");
                configuracoes.setCapability("automationName", "XCUITest");
                configuracoes.setCapability("deviceName", "Iphone 11 Pro Max");
                configuracoes.setCapability("platformName", "IOS");
                configuracoes.setCapability("platformVersion", "13.2");
                configuracoes.setCapability("autoAcceptAlerts", true);
                configuracoes.setCapability("udid", "14C10049-5022-41D1-B2ED-9B4F21C8932D");
                configuracoes.setCapability("app", System.getProperty("user.dir") + "/apps/ios/alura_esporte.apk");

                driver = new IOSDriver<>(getUrlAppium(), configuracoes);
                break;
            case ANDROID:
                System.out.println("Android");
                configuracoes.setCapability("deviceName", "Galaxy J5 Prime");
                configuracoes.setCapability("app",  System.getProperty("user.dir") + "/apps/android/alura_esporte.apk");
                configuracoes.setCapability("platformName", "Android");
                configuracoes.setCapability("appActivity", ".ui.activity.MainActivity");
                configuracoes.setCapability("appPackage", "br.com.alura.aluraesporte");
                configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                driver = new AndroidDriver<>(getUrlAppium(), configuracoes);

//                configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//                configuracoes.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/apps/android/alura_esporte.apk");
                break;
        }

        System.out.println("Espera driver");
        wait = new WebDriverWait(driver, 6000);
        System.out.println("Saiu da espera");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Passou drive manager");
    }

    public static void quit() {
        driver.quit();
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static WebDriverWait getDriverWait() {
        return wait;
    }
}
