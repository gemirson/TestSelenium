package pages;

import support.DriverQA;

public class ProcessoMostrar {

    private DriverQA driver;

    public ProcessoMostrar(DriverQA driver) {
        this.driver = driver;
    }

    public String RecuperarMensagemDeSucesso() {
        return  driver.getText("notice");
    }

    public void clicarVoltar() {
        driver.click(".ls-btn-primary-danger","css");
    }

    public void MostraProcesso(String campo) {
        driver.click(campo);
    }
}
