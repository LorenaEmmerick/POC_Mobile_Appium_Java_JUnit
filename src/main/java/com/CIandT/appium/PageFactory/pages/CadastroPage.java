package com.CIandT.appium.PageFactory.pages;

import com.CIandT.appium.PageFactory.elements.CadastroElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage extends CadastroElement {

    public CadastroPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    private void PreencherFormulario(String usuario, String senha, String confirmacao)
    {
        sendKeys(getCampoNome(), usuario);
        sendKeys(getCampoSenha(), senha);
        sendKeys(getCampoConfirmarSenha(), confirmacao);
    }

    public void cadastrar(String usuario, String senha, String confirmacao) {
        PreencherFormulario(usuario, senha,confirmacao);
        click(getBotaoCadastrar());
    }

    public String getMensagemErroTxt(){
        return getText(getMensagemErro());
    }
}
