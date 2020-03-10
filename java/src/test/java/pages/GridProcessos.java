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

    public void delete(String idElemento) {
        driver.click(idElemento);
    }
}
