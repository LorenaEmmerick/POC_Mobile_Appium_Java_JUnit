# Tutorial de instalação dos requisitos
> Aqui estão descritos os passos para configuração da maquina, antes de executar os testes
<hr>

Configurações para o Linux Ubuntu:

## Instalar Node (opcional)
```
    sudo apt install nodejs
```

## Instalar Appium
```
    npm install -g appium
```

## Instalar Appium Doctor
```
    sudo npm install appium-doctor -g
```
> Vamos utilizar esta ferramenta para verificar o que falta de config para startar o appium
> Após ter instalado de o comando: ``appium-doctor``
> Apartir daqui você pode seguir nos pontos que o appium doctor acusar como NOK

## [Java Kit JDK8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
Clique no link acima para baixa o JDK8

## [Appium desktop](https://github.com/appium/appium-desktop/releases/tag/v1.21.0-1)
Clique no link acima, e baixe o appium desktop

## [Android Studio](https://developer.android.com/studio)
CLique no link acima, e baixe o android studio

## Configurar variaveis de ambiente
- ### Instalar Rbenv
  - ``` sudo apt install rbenv```

- ### Abrir arquivo e adicionar variaveis
    - ``` sudo gedit ~/.bashrc```

- ### JAVA_HOME
      export JAVA_HOME=/usr/lib/java/jdk1.8.0_251
      export PATH="$PATH:$JAVA_HOME/bin"
      export PATH="/home/linuxbrew/.linuxbrew/bin:$PATH"
      export MANPATH="/home/linuxbrew/.linuxbrew/share/man:$MANPATH"
      export INFOPATH="/home/linuxbrew/.linuxbrew/share/info:$INFOPATH"

- ### ANDROID_HOME
      export PATH="$HOME/.rbenv/bin:$PATH"
      eval "$(rbenv init -)"
      export ANDROID_HOME=$HOME/Android/Sdk
      export PATH=$PATH:$HOME/bin:$ANDROID_HOME/tools
      export PATH=$PATH:$ANDROID_HOME/tools
      export PATH=$PATH:$ANDROID_HOME/platform-tools
      export PATH=$SDK_HOME:$PATH

> Apartir daqui, seu appium doctor deve estar com tudo ok.

## Instalar as dependências do projeto com Maven
```
    mvn install
```

## Instalando o JDK no Linux
```
    sudo apt update
    sudo apt search openjdk

    sudo apt install openjdk-8-jdk
    export JAVA_HOME=usr/lib/jvm/java-8-openjdk-amd64/
```
OU
```
sudo apt install openjdk-11-jdk
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
java -version
```


## Configurar APPIUM
```
echo $ANDROID_HOME
echo $JAVA_HOME
```
>Abra o appium, clique me Edit Configurations. Copie os valores printados das variaveis ANDROID_HOME e JAVA_HOME.
>Cole os valores em seus respectivos inputs, salve e restart

## Iniciar o Android Studio no Linux
```
cd android-studio/bin
./studio.sh
```

## Resolver dependências do projeto
```
mvn install
ou 
mvn dependency:resolve
```

## Caso não execute configure o java 8 como padrão de JVM
```
sudo update-alternatives --config java
```

## Rodar o Appium antes de iniciar os testes
```
appium
```

# Referencias 
https://medium.com/@herbert1078/como-configurar-o-appium-server-e-o-appium-desktop-de-uma-vez-por-todas-bbb3432d6573
https://www.programsbuzz.com/article/allure-report-cucumber
https://www.programsbuzz.com/course/cucumber-tutorial
https://junit.org/junit5/docs/current/api/

[⬆ Voltar ao topo](#Tutorial-de-instalação-dos-requisitos)<br>