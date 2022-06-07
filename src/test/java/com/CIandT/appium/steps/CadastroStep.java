package com.CIandT.appium.steps;

import com.CIandT.appium.pageFactory.pages.CadastroPage;
import com.CIandT.appium.pageFactory.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroStep {
    LoginPage loginPage = new LoginPage();
    CadastroPage cadastroPage = new CadastroPage();

    @Dado("que estou na tela de cadastro")
    public void que_estou_na_tela_de_cadastro() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickCadastro();
    }

    @Quando("cadastro usuario com senhas diferentes")
    public void cadastro_usuario_com_senhas_diferentes() {
        cadastroPage.cadastrar("Bugan", "123", "456");
    }

    @Entao("A mensagem Senhas não conferem deve ser sexibida")
    public void a_mensagem_senhas_não_conferem_deve_ser_sexibida() {
        assertEquals("Senhas não conferem", cadastroPage.getMensagemErroTxt());
    }
}
