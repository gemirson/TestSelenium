package pages;

import sun.awt.X11.XPropertyCache;
import support.DriverQA;

public class Acesso {
    private DriverQA driver;

    public Acesso(DriverQA driver) {
        this.driver = driver;
    }

    public void abrirPagina()
    {
        String url = "file:///home/gs/Documents/source/Automacao%20de%20Teste/selenium-webdriver/html/login.html";
        driver.openURL(url);
    }

    public void PreencherCampo(String nomeCampo, String valor) {
        driver.sendKeys(valor,nomeCampo);
    }

    public void ClickBotaoLogin() {
            driver.click("#btnLogin","css");
    }
}
