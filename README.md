# automacao-web-selenium-cucumber-pageobjects-java

Selenium WebDriver + Cucumber JVM + Page Object Pattern
Pequeno projeto de testes funcionais utilizando Selenium WebDriver com Cucumber JVM (BDD) e o padrão Page Object.

Para executar os testes é preciso certificar-se de ter instalado o Maven e o driver do Google Chrome.
Deve-se verificar qual a versão do seu navegador chrome e baixar a versão do chrome driver subsequente.

Segue o link para baixar o chrome driver: https://chromedriver.chromium.org/downloads

Ao baixar, deve-se substituir a seguinte linha de código na classe Driver.java com o endereço da pasta do driver que você baixou na sua máquina.		
System.setProperty("webdriver.chrome.driver", "/home/naira/drivers/chromedriver_linux64/chromedriver");

Para clonar o projeto para sua máquina basta executar o comando: git clone https://github.com/nairabrito/automacao-web-selenium-cucumber-pageobjects-java.git no seu terminal.
