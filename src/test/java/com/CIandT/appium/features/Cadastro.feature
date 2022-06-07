# language: pt
@CadastroSuite
Funcionalidade: Cadastro

  Cenario: Cadastro de usuario
    Dado que estou na tela de cadastro
    Quando cadastro usuario com senhas diferentes
    Entao A mensagem Senhas não conferem deve ser sexibida
