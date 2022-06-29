
# POC MOBILE
>Projeto de exemplo para automações mobile, automatiza app Alura Esportes

## ⚒️ Recursos utilizados
- **Tecnologias**
    - [Java](https://www.java.com/pt-BR/)
    - [Maven](https://maven.apache.org/guides/index.html)
    - [Lombok](https://projectlombok.org/features/all)
    - [JUnit](https://junit.org/junit4/ "JUnit")
    - [Cucumber](https://cucumber.io/)
    - [Appium](https://appium.io/)
    - [PageFactory](https://naveenautomationlabs.com/13-implementing-page-factory-in-appium-based-framework/ "PageFactory")
    - [PageObject (pattern)](https://martinfowler.com/bliki/PageObject.html "PageObject")
    - [ExtentReportsAdapter](https://ghchirp.tech/2098/ "ExtentReportsAdapter")

## 🏃 Escolha um runner
*Para escolher um runner, utilize os parâmetros:*

- ` Dtest=Runner`
>Runner é onde vamos agrupar as tags do cucumber. Funciona como uma suite de teste. 

## 📱 Escolha da Plataforma
*Para selecionar a Plataforma de execução do teste, utilize os parâmetros:*

- Dplatform=IOS

- Dplatform=ANDROID

> OBS: Caso a variavel platform não seja declarada, o valor default é Dplatform=ANDROID. E
> caso seja informado qualquer valor diferente de ANDROID ou IOS, sera lançada uma exception.
 

## 💻 Pré-requisitos para executar os testes do projeto

- [x] Appium instalado
- [x] Appium desktop instalado
- [x] Android studio instalado (ou algum emulador)
- [x] Rbenv instalado
- [x] JDK e SDK instalados
- [x] Variaveis de ambiente configurada (ANDROID_HOME e JAVA_HOME)
- [x] Appium doctor com tudo OK
- [x] Conseguir startar o server do APPIUM
- [x] Startar emulador mobile


> Caso não atenda algum dos requsitos e não saiba como configurar a máquina siga este tutorial [README CONFIGURAÇÕES](README-configuracao.md)  


## 🚀 Execução dos Testes
#### Para executar os testes pela tag Cucumber:    
`mvn clean test -Dcucumber.filter.tags=@CadastroSuite -Dplatform=ANDROID`

ou

`mvn clean test -Dcucumber.filter.tags=@CadastroSuite -Dplatform=IOS`

#### Para executar os testes pelos runner's:
`mvn clean test -Dtest=Runner -Dplatform=ANDROID`

ou 

`mvn clean test -Dtest=Runner -Dplatform=IOS`

>Você pode também rodar os testes através da interface de sua IDE, nesse caso para escolher a plataforma
> é necessário alterar o valor de retorno do Else dentro do metodo getPlatform() na classe Utils. 
> Além disso, nesse caso a pasta de relatório não sera gerada dentro da pasta target, ficara na raiz do projeto allure-reports
> >OBS: Tags no CI tem maior chance de falhar. Por este motivo a melhor prática é utilizar os runners para executar em CI. 

## 📜 Geração de relatórios

### Cucumber
O relatório JSON é gerado automaticamente dentro do diretório ``target/jsonReports``

### Extent Adapter
O relatórios são gerados automaticamente dentro do diretório ``test-output`` nos formatos HTML, JSON e PDF


[⬆ Voltar ao topo](#POC-MOBILE)<br>