package pages;

import support.DriverQA;

public class Home {

    private DriverQA driver;

    public Home(DriverQA driver) {

        this.driver = driver;
    }

    public void abrirPagina() {
        String url = "http://agapito-server.herokuapp.com/";
        driver.openURL(url);
    }
}