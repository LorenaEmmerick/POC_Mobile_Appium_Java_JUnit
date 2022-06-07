package com.CIandT.appium.pageFactory.elements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;

@Getter
public class LoginElement extends com.CIandT.appium.PageFactory.BasePage {
    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
    private MobileElement botaoCadastro;
}
