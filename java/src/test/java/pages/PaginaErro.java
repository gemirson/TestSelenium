package pages;

import support.DriverQA;

public class PaginaErro {
    private DriverQA driver;
    public PaginaErro(DriverQA driver) {
        this.driver = driver;
    }

    public String BuscarMensagem() {
        return driver.getText("result");
    }
}
