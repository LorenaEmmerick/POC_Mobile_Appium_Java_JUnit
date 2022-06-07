package com.CIandT.appium.pageFactory.pages;

import com.CIandT.appium.pageFactory.elements.LoginElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginElement {
    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public void clickCadastro(){
        click(getBotaoCadastro());
    }
}
