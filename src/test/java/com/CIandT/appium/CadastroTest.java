package com.CIandT.appium;

import static org.junit.Assert.assertTrue;

import com.CIandT.appium.PageFactory.pages.CadastroPage;
import com.CIandT.appium.PageFactory.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import static org.junit.Assert.assertEquals;

public class CadastroTest extends BaseTest {


    @Test
    public void nao_consigo_cadastrar_usuario_com_senhas_que_nao_conferem() {
        System.out.println("Entrou no teste");
        LoginPage telaLogin = new LoginPage();

        System.out.println("Criou tela login");
        telaLogin.clickCadastro();

        System.out.println("Criou Tela Cadastro");
        CadastroPage telaCadastro = new CadastroPage();
        System.out.println("Clicou em cadastro");
        telaCadastro.cadastrar("Bugan", "123", "456");
        System.out.println("Preencheu form");
        assertEquals("Senhas não conferem", telaCadastro.getMensagemErroTxt());
    }

    @Test
    public void posso_cadastrar_usuario_com_senhas_que_conferem() throws NoSuchElementException {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

//        MobileElement botaoCadastro = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
//        botaoCadastro.click();
//
//        CadastroPageObject telaCadastro = new CadastroPageObject(driver);
//        telaCadastro.BuscarElementos();
//        telaCadastro.Cadastrar("Bugan", "123", "123");
//        MobileElement botaoLogar = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");

    }

}
