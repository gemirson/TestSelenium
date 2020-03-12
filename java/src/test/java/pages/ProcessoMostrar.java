package pages;

import support.DriverQA;

public class ProcessoMostrar {

    private DriverQA driver;

    private String currentId;

    public ProcessoMostrar(DriverQA driver) {
        this.driver = driver;
    }

    public String RecuperarMensagemDeSucesso() {
        return  driver.getText("notice");
    }

    public void clicarVoltar() {
        currentId = driver.getId();
        driver.click(".ls-btn-primary-danger","css");

    }

    public void MostraProcesso(String campo) {
        driver.click(campo);
    }

    public  String Id(){ return  currentId;}

    public  String  Mensagem(String url) throws InterruptedException {
        driver.ChooseOkOnNextConfirmation();
        driver.GetMensagem(url);
        String s= driver.getCurrentURL();
        return  s;

    }

    public String MensagemErro()
    {
        return driver.getText("p[role=alert]","css");
    }

    public String MostraCampos()
    {
        return  driver.getMostrarCampo("test");
    }
}
