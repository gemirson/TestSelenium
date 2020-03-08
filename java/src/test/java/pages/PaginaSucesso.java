package pages;

import support.DriverQA;

public class PaginaSucesso
{
    private DriverQA driver;

    public PaginaSucesso(DriverQA stepDriver){
        driver = stepDriver;
    }

    public String BuscarMensagem(){
        return driver.getText("result");
    }
}
