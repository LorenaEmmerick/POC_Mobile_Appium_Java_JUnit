package com.CIandT.appium.PageFactory.elements;

import com.CIandT.appium.PageFactory.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;

@Getter
public class CadastroElement extends BasePage {
    //    Anotações para encontrar o elemento tanto Android quanto IOs
    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
    private MobileElement campoNome;

    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    private MobileElement campoSenha;

    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
    private MobileElement campoConfirmarSenha;

    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
    private MobileElement botaoCadastrar;

    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/erro_cadastro")
    private MobileElement mensagemErro;
}
