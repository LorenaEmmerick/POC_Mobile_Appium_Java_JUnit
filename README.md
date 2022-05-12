# POC_Mobile_Appium_Java_JUnit

Após ter o node instalado:
Instalar Appium
```
npm install -g appium
```

Verificar o que precisa para rodar o Appium
```
npx appium-doctor
```

Instalar as dependências do projeto
```
mvn install
```

Instalando o JDK
```
sudo apt update
sudo apt search openjdk

sudo apt install openjdk-8-jdk
export JAVA_HOME=usr/lib/jvm/java-8-openjdk-amd64/

ou

sudo apt install openjdk-11-jdk
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
java -version
```

Editar os arquivos das variáveis de ambiente no Linux
```
sudo gedit ~/.bashrc
```

Atualizar os arquivos no 'bashrc'
```
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$PATH:$JAVA_HOME/bin
ou 
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export PATH=$PATH:$JAVA_HOME/bin
e
export ANDROID_HOME=/usr/home/lorenae/Android/Sdk
export PATH=$PATH:$ANDROID_HOME/emulator
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/platform-tools
```

Atualizar os arquivos das variáveis de ambiente no Linux
```
source ~/.bashrc
```

Verificar as instalações
```
echo $ANDROID_HOME
echo $JAVA_HOME
npx appium-doctor
```

Iniciar o Android Studio:
```
cd android-studio/bin
./studio.sh
```

Instalar o KVM para o AVD do Android Studio
```
sudo apt-get install qemu-kvm libvirt-bin ubuntu-vm-builder bridge-utils
sudo apt-get install cpu-checker
```

Colocar o ícone do Android Studio
```
sudo snap install android-studio --classic
```

Resolver dependências do projeto
```
mvn install
ou 
mvn dependency:resolve
```

UIAutomatorViewer para inspecionar o apk
cd Android/Sdk/tools/bin
```
./uiautomatorviewer
```

Caso não execute configure o java 8 como padrão de JVM
```
sudo update-alternatives --config java
```

Rodar o Appium antes de iniciar os testes
```
appium
```

Rode os testes no JUnit