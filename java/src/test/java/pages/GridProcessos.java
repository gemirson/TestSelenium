package pages;

import support.DriverQA;

public class GridProcessos
{
    private DriverQA driver;
    public GridProcessos(DriverQA driver) {
        this.driver = driver;
    }

    public  void clicarNovoProcesso()
    {
        driver.click("btn-novo");
    }

    public boolean ExisteTexto(String mensagem) {
        return  driver.getAllTexPage(mensagem);
    }

    public String   IdElemento(String value){
        return driver.getId(value);
    }

    public void delete(String idElemento) {
        driver.click(idElemento);
    }
}
