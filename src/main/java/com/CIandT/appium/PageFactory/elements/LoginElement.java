package com.CIandT.appium.PageFactory.elements;

import com.CIandT.appium.PageFactory.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;

@Getter
public class LoginElement extends BasePage {
    @iOSXCUITFindBy(id = "idIOS")
    @AndroidBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
    private MobileElement botaoCadastro;
}
