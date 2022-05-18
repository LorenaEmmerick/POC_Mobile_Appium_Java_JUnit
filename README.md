# POC_Mobile_Appium_Java_JUnit

Configurações para o Linux Ubuntu:

Após ter o node instalado:
Instale Appium
```
npm install -g appium
```

Verifique o que precisa para rodar o Appium
```
npx appium-doctor
```

Instale as dependências do projeto com Maven
```
mvn install
```

Instale o JDK no Linux
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

Edite os arquivos das variáveis de ambiente no Linux
```
sudo gedit ~/.bashrc
```

Atualize os arquivos no 'bashrc' no Linux
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

Atualize os arquivos das variáveis de ambiente no Linux
```
source ~/.bashrc
```

Verifique as instalações no Linux
```
echo $ANDROID_HOME
echo $JAVA_HOME
npx appium-doctor
```

Inicie o Android Studio no Linux
```
cd android-studio/bin
./studio.sh
```

Instale o KVM para o AVD do Android Studio no Linux
```
sudo apt-get install qemu-kvm libvirt-bin ubuntu-vm-builder bridge-utils
sudo apt-get install cpu-checker
```

Resolva as dependências do projeto
```
mvn install
ou 
mvn dependency:resolve
```

UIAutomatorViewer para inspecionar o apk
```
cd Android/Sdk/tools/bin
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